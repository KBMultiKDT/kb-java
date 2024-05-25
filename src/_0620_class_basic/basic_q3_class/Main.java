package _0620_class_basic.basic_q3_class;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book();
        book1.setTitle("The Great Gatsby");
        book1.setAuthor("F. Scott Fitzgerald");
        book1.setIsbn("9780743273565");

        Book book2 = new Book();
        book2.setTitle("1984");
        book2.setAuthor("George Orwell");
        book2.setIsbn("9780451524935");

        library.addBook(book1);
        library.addBook(book2);

        System.out.println("------도서관 책 등록-------");
        library.displayBooks();
    }
}

