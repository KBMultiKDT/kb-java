package _0701_collection_deep;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileOutputStream;
import java.io.IOException;

public class deep_q1_casting {
    public static void main(String[] args) {
        try {
            // 1. 사이트에 연결해서, HTML 문서를 다 가지고 오기
            Document doc = Jsoup.connect("https://news.naver.com/").get();

            // 2. 원하는 요소를 선택해서 가져오기
            Elements list = doc.select(".Nitem_link_menu"); // class가 Nitem_link_menu인 태그를 선택

            // 3. 가져온 요소의 크기 출력
            System.out.println("Number of items: " + list.size());

            // 4. 엑셀 파일 생성
            try (Workbook workbook = new HSSFWorkbook()) {
                Sheet sheet = workbook.createSheet("Naver News");

                // 5. 헤더 작성
                Row headerRow = sheet.createRow(0);
                Cell headerCell0 = headerRow.createCell(0);
                headerCell0.setCellValue("Index");
                Cell headerCell1 = headerRow.createCell(1);
                headerCell1.setCellValue("Text");

                // 6. 각 요소의 텍스트를 엑셀 파일에 저장
                for (int i = 0; i < list.size(); i++) {
                    Element tag = list.get(i);
                    System.out.println(i + ": " + tag.text());

                    Row row = sheet.createRow(i + 1);
                    Cell cell0 = row.createCell(0);
                    cell0.setCellValue(i);
                    Cell cell1 = row.createCell(1);
                    cell1.setCellValue(tag.text());
                }

                // 7. 엑셀 파일 저장
                try (FileOutputStream fileOut = new FileOutputStream("NaverNews.xlsx")) {
                    workbook.write(fileOut);
                }

                // 8. 자원 해제
                workbook.close();
            }
            System.out.println("Data saved to NaverNews.xlsx");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
