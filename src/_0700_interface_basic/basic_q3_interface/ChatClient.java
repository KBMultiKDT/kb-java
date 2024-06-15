package _0700_interface_basic.basic_q3_interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient extends JFrame {
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;
    private JTextArea chatArea;
    private JTextField inputField;
    private JButton sendButton;

    public ChatClient(String host, int port) {
        try {
            // 서버에 연결
            socket = new Socket(host, port);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);

            // GUI 설정
            setTitle("Chat Client");
            setSize(400, 300);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // 채팅 내용을 표시할 TextArea 생성
            chatArea = new JTextArea();
            chatArea.setEditable(false);
            add(new JScrollPane(chatArea), BorderLayout.CENTER);

            // 메시지 입력 필드 및 전송 버튼
            inputField = new JTextField();
            sendButton = new JButton("Send");
            JPanel inputPanel = new JPanel(new BorderLayout());
            inputPanel.add(inputField, BorderLayout.CENTER);
            inputPanel.add(sendButton, BorderLayout.EAST);
            add(inputPanel, BorderLayout.SOUTH);

            // 메시지 보내기 이벤트 처리
            sendButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    sendMessage();
                }
            });
            inputField.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    sendMessage();
                }
            });

            // 메시지 수신을 위한 쓰레드 시작
            new Thread(new Runnable() {
                public void run() {
                    receiveMessage();
                }
            }).start();

            setVisible(true);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "서버 연결 실패", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }

    private void sendMessage() {
        String message = inputField.getText();
        if (!message.isEmpty()) {
            out.println(message);
            inputField.setText("");
        }
    }

    private void receiveMessage() {
        try {
            String message;
            while ((message = in.readLine()) != null) {
                chatArea.append(message + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
            new ChatClient("localhost", 12345);

    }
}
