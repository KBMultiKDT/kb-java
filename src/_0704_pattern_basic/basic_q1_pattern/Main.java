package _0704_pattern_basic.basic_q1_pattern;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection connection1 = DatabaseConnection.getInstance();
        DatabaseConnection connection2 = DatabaseConnection.getInstance();
        DatabaseConnection connection3 = DatabaseConnection.getInstance();

        System.out.println("Connection 1 주소: " + System.identityHashCode(connection1));
        System.out.println("Connection 2 주소: " + System.identityHashCode(connection2));
        System.out.println("Connection 3 주소: " + System.identityHashCode(connection3));
    }
}

