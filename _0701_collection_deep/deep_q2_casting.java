package _0701_collection_deep;


import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.FileOutputStream;
import java.io.IOException;


public class deep_q2_casting {
        public static void main(String[] args) {
            String url = "https://ohou.se/";

            try {
                // 1. 오픈 하우스 페이지 연결
                Document doc = Jsoup.connect(url).get();

                // 2. 원하는 데이터 선택 (예시: 인기 상품 리스트)
                Elements productList = doc.select(".css-f87fft");
                System.out.println(productList);
                // 3. 엑셀 파일 생성
                Workbook workbook = new HSSFWorkbook();
                Sheet sheet = workbook.createSheet("Ohou Products");

                // 4. 헤더 작성
                Row headerRow = sheet.createRow(0);
                headerRow.createCell(0).setCellValue("번호");
                headerRow.createCell(1).setCellValue("상단메뉴명");

                // 5. 데이터 작성
                for (int i = 0; i < productList.size(); i++) {
                    String product = productList.get(i).text();

                    Row row = sheet.createRow(i + 1);
                    row.createCell(0).setCellValue(i + 1);
                    row.createCell(1).setCellValue(product);
                    System.out.println(product);
                }

                // 6. 엑셀 파일 저장
                try (FileOutputStream fileOut = new FileOutputStream("OhouProducts.xlsx")) {
                    workbook.write(fileOut);
                }

                // 7. 자원 해제
                workbook.close();
                System.out.println("Data saved to OhouProducts.xlsx");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
