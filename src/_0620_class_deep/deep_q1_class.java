package _0620_class_deep;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class deep_q1_class {
        public static void main(String[] args) {
            String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
            String pwRegex = "^(?=.*[A-Z])(?=.*[!@#$%^&*()-+]).{8,}$";

            String email = "example@example.com";
            String pw = "Password123!";

            // Id (email) 유효성 검증
            if (isValidEmail(email, emailRegex)) {
                System.out.println("Valid email");
            } else {
                System.out.println("Invalid email");
            }

            // pw 유효성 검증
            if (isValidPassword(pw, pwRegex)) {
                System.out.println("Valid password");
            } else {
                System.out.println("Invalid password");
            }
        }

        // Id(email) 유효성 검증 메서드
        public static boolean isValidEmail(String email, String regex) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();
        }

        // pw 유효성 검증 메서드
        public static boolean isValidPassword(String pw, String regex) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(pw);
            return matcher.matches();
        }
    }
