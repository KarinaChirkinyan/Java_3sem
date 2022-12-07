package lab_8;
// задание 2. Реализовать вывод информации из файла на экран

import java.io.*;

public class File {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("C:\\Users\\karin\\OneDrive\\Рабочий стол\\Универ\\Java_3sem\\src\\lab_8\\A.txt");

            while (reader.ready()) { //пока есть непрочитанные байты в потоке ввода
                int data = reader.read(); //читаем один символ
                System.out.print((char) data);
            }


            reader.close(); //закрываем поток

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}