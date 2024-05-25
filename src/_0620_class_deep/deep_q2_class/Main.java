package _0620_class_deep.deep_q2_class;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        MenuCrawler crawler = new MenuCrawler();
        try {
            crawler.fetchAndPrintMenu();
        } catch (IOException e) {
            System.out.println("Error fetching menu: " + e.getMessage());
        }
    }
}

