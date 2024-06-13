package _0703_interface_basic.basic_q3_interface;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ChatServer {
    static DatagramSocket socket = null;
    static InetAddress clientAddress = null;
    static int clientPort = 0;

    public static void main(String[] args) {
        byte[] receiveData = new byte[1024];
        try {
            socket = new DatagramSocket(9876);;

            // 수신 쓰레드
            Thread receiveThread = new Thread(() -> {
                try {
                    while (true) {
                        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                        socket.receive(receivePacket);
                        clientAddress = receivePacket.getAddress();
                        clientPort = receivePacket.getPort();
                        String message = new String(receivePacket.getData(), 0, receivePacket.getLength());
                        System.out.println(message);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
            receiveThread.start();

            // 송신 쓰레드
            Scanner scanner = new Scanner(System.in);
            while (true) {
                String message = scanner.nextLine();
                if (clientAddress != null) {
                    byte[] sendData = message.getBytes();
                    DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress, clientPort);
                    socket.send(sendPacket);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (socket != null && !socket.isClosed()) {
                socket.close();
            }
        }
    }
}
