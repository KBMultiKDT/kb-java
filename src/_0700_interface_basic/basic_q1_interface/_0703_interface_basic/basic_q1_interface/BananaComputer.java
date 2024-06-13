package _0700_interface_basic.basic_q1_interface._0703_interface_basic.basic_q1_interface;

public class BananaComputer implements Computer {
    @Override
    public void start() {
        System.out.println("Banana Computer starting.");
    }

    @Override
    public void shutdown() {
        System.out.println("Banana Computer shutting down.");
    }

    @Override
    public void restart() {
        System.out.println("Banana Computer restarting.");
    }
}
