package _0703_interface_basic.basic_q1_interface;

public class Main {
    public static void main(String[] args) {
        Computer myApple = new AppleComputer();
        Computer myBanana = new BananaComputer();

        System.out.println("Testing Apple Computer:");
        myApple.start();
        myApple.restart();
        myApple.shutdown();

        System.out.println("\nTesting Banana Computer:");
        myBanana.start();
        myBanana.restart();
        myBanana.shutdown();
    }
}
