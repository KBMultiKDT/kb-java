package _0702_interface_basic.basic_q2_interface;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPClient {

    public static void main(String[] args) throws Exception {
        for (int j = 0; j < 10000; j++) {
            Socket socket = new Socket("localhost", 9100);
            System.out.println("client=> " + j + " 서버와 연결됨.");

            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String data = input.readLine();
            System.out.println("받은 데이터: " + data);
            System.out.println("클라이언트 포트>> " + socket.getLocalPort());
        }
    }
}