package lab_2;
import java.lang.*;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Льюис Кэрролл", "Алиса в стране чудес", 1865, 250);

        System.out.println(book.getKolstr());
        book.setkolStr(150);
        System.out.println("Новое количество страниц: "+book.getKolstr());
    }
}
