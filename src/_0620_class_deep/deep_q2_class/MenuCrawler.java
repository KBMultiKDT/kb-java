package _0620_class_deep.deep_q2_class;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class MenuCrawler {
    public void fetchAndPrintMenu() throws IOException {
        String url = "https://www.naver.com";
        Document doc = Jsoup.connect(url).get();
        Elements menuItems = doc.select(".service_name");
        System.out.println(menuItems.size());
        for (Element menuItem : menuItems) {
            String menuText = menuItem.text();
            System.out.println(menuText);
        }
    }
}
