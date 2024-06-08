package _0703_interface_basic.basic_q2_interface;

import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer extends JFrame {
    private ServerSocket serverSocket;
    private List<PrintWriter> clients;
    private JTextArea logArea;
    private JButton startButton, stopButton;
    private int port;

    public ChatServer(int port) {
        this.port = port;
        clients = new ArrayList<>();

        // GUI 설정
        setTitle("Chat Server");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // 로그 영역
        logArea = new JTextArea();
        logArea.setEditable(false);
        add(new JScrollPane(logArea), BorderLayout.CENTER);

        // 서버 제어 버튼
        startButton = new JButton("Start Server");
        stopButton = new JButton("Stop Server");
        stopButton.setEnabled(false);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(startButton);
        buttonPanel.add(stopButton);
        add(buttonPanel, BorderLayout.SOUTH);

        // 이벤트 리스너 설정
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startServer();
            }
        });

        stopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                stopServer();
            }
        });

        setVisible(true);
    }

    private void startServer() {
        startButton.setEnabled(false);
        stopButton.setEnabled(true);
        logArea.append("Server starting...\n");
        new Thread(() -> {
            try {
                serverSocket = new ServerSocket(port);
                logArea.append("Server started on port " + port + ".\n");
                acceptConnections();
            } catch (IOException e) {
                e.printStackTrace();
                logArea.append("Could not start server: " + e.getMessage() + "\n");
            }
        }).start();
    }

    private void stopServer() {
        try {
            if (serverSocket != null && !serverSocket.isClosed()) {
                serverSocket.close();
                logArea.append("Server stopped.\n");
                startButton.setEnabled(true);
                stopButton.setEnabled(false);
            }
        } catch (IOException e) {
            e.printStackTrace();
            logArea.append("Error stopping server: " + e.getMessage() + "\n");
        }
    }

    private void acceptConnections() {
        try {
            while (!serverSocket.isClosed()) {
                Socket socket = serverSocket.accept();
                logArea.append("New client connected.\n");
                handleClient(socket);
            }
        } catch (IOException e) {
            logArea.append("Server stopped accepting new connections.\n");
        }
    }

    private void handleClient(Socket socket) {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            clients.add(out);

            String line;
            while ((line = in.readLine()) != null) {
                broadcastMessage(line);
            }
        } catch (IOException e) {
            logArea.append("Error handling client connection.\n");
        }
    }

    private void broadcastMessage(String message) {
        for (PrintWriter out : clients) {
            out.println(message);
        }
        logArea.append("Broadcast: " + message + "\n");
    }

    public static void main(String[] args) {
        new ChatServer(12345);
    }
}