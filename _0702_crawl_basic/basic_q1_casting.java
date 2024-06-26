package _0702_crawl_basic;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.io.PrintWriter;

public class basic_q1_casting {
        public static void main(String[] args) {
            String url = "https://finance.naver.com/item/main.naver?code=005930";
            try {
                Document doc = Jsoup.connect(url).get();
                //Elements dataElements = doc.select(".new_totalinfo dl dd:nth-child(2)");

                String code = "005930";  // 종목코드 직접 입력
                String companyName = "삼성전자";  // 회사 이름
                String openPrice = doc.select("td.first").get(0).text().split(" ")[2];  // 시가
                String highPrice = doc.select("p.no_today").get(0).text().split(" ")[0];  // 종가

                System.out.println("Code: " + code);
                System.out.println("Company Name: " + companyName);
                System.out.println("Open Price: " + openPrice);
                System.out.println("High Price: " + highPrice);

                try (PrintWriter out = new PrintWriter("stock_info.txt")) {
                    out.println("Code: " + code);
                    out.println("Company Name: " + companyName);
                    out.println("Open Price: " + openPrice);
                    out.println("High Price: " + highPrice);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
