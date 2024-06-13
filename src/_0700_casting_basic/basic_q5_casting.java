package _0700_casting_basic;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class basic_q5_casting {
    public static void main(String[] args) {
        try {
            // 1. 사이트에 연결해서, HTML 문서를 다 가지고 오기
            Document doc = Jsoup.connect("https://news.naver.com/").get();

            // 2. 원하는 요소를 선택해서 가져오기
            Elements list = doc.select(".Nitem_link_menu"); // class가 Nitem_link_menu인 태그를 선택

            // 3. 가져온 요소의 크기 출력
            System.out.println("Number of items: " + list.size());

            // 4. 각 요소의 텍스트를 출력
            for (int i = 0; i < list.size(); i++) {
                Element tag = list.get(i);
                System.out.println(i + ": " + tag.text());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
