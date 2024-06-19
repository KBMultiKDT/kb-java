package _0620_class_basic.basic_q3_class;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[2];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < books.length ; i++) {
            System.out.print("책제목, 작가, isbn을 순서대로 입력>> ");
            books[i] = new Book();
            books[i].setTitle(sc.next());
            books[i].setAuthor(sc.next());
            books[i].setIsbn(sc.next());
        }
        sc.close();

        System.out.println("------등록된 도서관 책 목록-------");
        for (int i = 0; i < books.length; i++) {
            books[i].displayInfo();
        }
    }
}

