package _0703_pattern_deep.deep_q1_pattern;

public class DatabaseConnection {
    private static DatabaseConnection instance;

    // private constructor to prevent instantiation
    private DatabaseConnection() {
        System.out.println("데이터베이스 연결 객체가 생성되었습니다.");
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
}

