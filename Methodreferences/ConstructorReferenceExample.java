package Methodreferences;
import java.util.function.Supplier;
class Book {
    private String title;public Book() {
        this.title = "Unknown";
    }public String getTitle() {
        return title;
    }
}
public class ConstructorReferenceExample {
    public static void main(String[] args) {
        Supplier<Book> bookSupplier = Book::new;
        Book book = bookSupplier.get();
        System.out.println("Book title: " + book.getTitle());
    }
}



