package lab_2;
import java.lang.*;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book();

        book.author.setAuthor("Льюис Кэрролл", 'м');
        book.name.setName("Алиса в стране чудес");
        book.year.setYear(1865);
        System.out.println(book.name.getName());
        System.out.println(book.author.getAuthorName());
        System.out.println(book.author.getAuthorGender());
    }
}
