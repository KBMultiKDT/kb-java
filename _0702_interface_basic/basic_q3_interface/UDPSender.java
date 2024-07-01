package _0702_interface_basic.basic_q3_interface;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPSender {

    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        String str = "i am a android programmer!";
        byte[] data = str.getBytes();
        InetAddress ip = InetAddress.getByName("127.0.0.1");

        DatagramPacket packet = new DatagramPacket(data, data.length, ip, 7100);

        socket.send(packet);
        System.out.println("클라이언트 포트>> " + socket.getLocalPort());
        socket.close();
    }

}