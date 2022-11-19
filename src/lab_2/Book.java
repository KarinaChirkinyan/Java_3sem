// изучить понятие класса и научиться создавать классы
package lab_2;
import java.lang.*;

public class Book {
    private String author;
    private String name;
    private int year;
    private int kolStr;

    // Конструктор класса
    public Book(String Nauthor, String Nname, int Nyear, int NkolStr){
        author = Nauthor;
        name = Nname;
        year = Nyear;
        kolStr = NkolStr;
    }

    // Метод, возвращающий автора
    public String getAuthor(){
        return author;
    }

    // Метод, возвращающий название
    public String getName(){
        return name;
    }

    // Метод, возвращающий год написания
    public int getYear(){
        return year;
    }

    // Метод, возвращающий количество страниц
    public int getKolstr(){
        return kolStr;
    }


    // Метод, устанавливающий автора
    public void setAuthor(String Nauthor){
        author = Nauthor;
    }

    // Метод, возвращающий название
    public void setName(String Nname){
        name = Nname;
    }

    // Метод, возвращающий год написания
    public void setYear(int Nyear){
        year = Nyear;
    }

    // Метод, возвращающий количество страниц
    public void setkolStr(int NkolStr){
        kolStr = NkolStr;
    }


}
