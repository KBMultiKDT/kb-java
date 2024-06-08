package _0703_interface_basic.basic_q1_interface;

public class AppleComputer implements Computer {
    @Override
    public void start() {
        System.out.println("Apple Computer starting.");
    }

    @Override
    public void shutdown() {
        System.out.println("Apple Computer shutting down.");
    }

    @Override
    public void restart() {
        System.out.println("Apple Computer restarting.");
    }
}

