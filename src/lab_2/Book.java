// изучить понятие класса и научиться создавать классы
package lab_2;
import java.lang.*;

public class Book {
    class Author{
        private String name;
        private char gender;

        public Author() {}

        public void setAuthor(String name, char gender){
            this.name = name;
            this.gender = gender;
        }
        public String getAuthorName(){
            return name;
        }
        public char getAuthorGender(){
            return gender;
        }
    }

    class Name{
        private String name;
        public Name() {}
        public void setName (String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }
    }

    class Year{
        private int year;
        public Year() {}
        public void setYear(int year){
            this.year = year;
        }
        public int getYear(){
            return year;
        }
    }

    Author author = new Author();
    Name name = new Name();
    Year year = new Year();

    public Book(){}
}
