package _0702_crawl_basic.basic_q2_casting;

import java.io.FileWriter;

public class 네이버증권UI1 {

        public static void main(String[] args) {
            String[] codes = {"005930", "293490", "019170", "253840", "047820"};
            //String[] names = {"삼성전자","카카오게임즈", "신풍제약", "수젠텍", "초록뱀"};

            네이버증권크롤링2 naver = new 네이버증권크롤링2();
            for (int i = 0; i < codes.length; i++) {
                String[] result = naver.crawl(codes[i]);
                try {
                    FileWriter file = new FileWriter(result[0] + ".txt");
                    file.write(result[0] + "\n"); //이름
                    file.write(result[1] + "\n"); //code
                    file.write(result[2] + "\n"); //현재가
                    file.write(result[3] + "\n"); //어제와의 차이
                    file.write(result[4] + "\n"); //증감비율
                    file.close();
                } catch (Exception e) {
                    System.out.println("파일 저장 중 에러발생함.!!");
                }
            }
        }
    }
