package _0703_interface_basic.basic_q1_interface;

public class Main {
    public static void main(String[] args) {
        System.out.println("애플컴퓨터---------------");
        AppleComputer appleComputer = new AppleComputer();
        appleComputer.start();
        appleComputer.shutdown();
        appleComputer.restart();

        System.out.println("바나나컴퓨터---------------");
        BananaComputer bananaComputer = new BananaComputer();
        bananaComputer.start();
        bananaComputer.shutdown();
        bananaComputer.restart();
    }
}
