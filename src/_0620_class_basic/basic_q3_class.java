package _0620_class_basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class basic_q3_class {

    public static void main(String[] args) {
        String text = "안녕하세요. 제 전화번호는 010-1234-5678이고, 회사 번호는 02-9876-5432 입니다.";

        // 전화번호를 찾는 정규 표현식
        String regex = "\\b(\\d{3}-\\d{3,4}-\\d{4})\\b";

        // 정규 표현식과 일치하는 부분을 찾아내어 출력
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("전화번호를 찾아냈습니다:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
