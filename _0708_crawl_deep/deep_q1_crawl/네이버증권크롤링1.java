package _0708_crawl_deep.deep_q1_crawl;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class 네이버증권크롤링1 {

        public static void main(String[] args) {
            Connection con = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=293490");

            try {
                Document doc = con.get();
                Elements list = doc.select("h2 > a");
                String name = list.get(0).text();
                System.out.println("회사이름: " + name);

                Elements list2 = doc.select("span.code");
                String code = list2.get(0).text();
                System.out.println("회사코드: " + code);

                Elements list3 = doc.select("div.today");
                //System.out.println(list3);
                Elements list4 = list3.select(".blind");
                //System.out.println(list4);
                String now = list4.get(0).text(); //현재가
                String dif = list4.get(1).text(); //차이
                String percent = list4.get(2).text(); //증감비율
                System.out.println("현재가: " + now);
                System.out.println("어제와의 차이: " + dif);
                System.out.println("증감비율: " +  percent);

            } catch (IOException e) {
                e.printStackTrace();
            }




        }

    }



