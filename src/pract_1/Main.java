// Цель - освоить работу с классами на Java
package pract_1;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Остров сокровищ", 2012);
        Book book2 = new Book("Кот в сапогах");
        book2.setDate(2000);
        System.out.println(book1);
        book1.library();
        book2.library();
    }
}