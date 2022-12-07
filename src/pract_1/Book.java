package pract_1;
import java.lang.*;

public class Book {
    private String name;
    private int publ_date;

    public Book(String n, int year){
        name = n;
        publ_date = year;
    }
    public Book(String n){
        name = n;
        publ_date = 0;
    }
    public Book(){
        name = "Алиса в стране чудес";
        publ_date = 2020;
    }
    public void setDate (int publ_date){
        this.publ_date = publ_date;
    }
    public void setName (String name){
        this.name = name;
    }
    public int getDate(){
        return publ_date;
    }
//    public String toString(){
//        return this.name+", "+this.publ_date;
//    }
    public void library(){
        System.out.println("Название: " + name + ", Год: " + publ_date);
    }
}