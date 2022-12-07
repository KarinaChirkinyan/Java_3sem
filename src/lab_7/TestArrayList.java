package lab_7;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<String>(); // создание объекта
        arr.add("0"); // добавление элемента
        arr.add("C");
        arr.add("2");
        arr.add("Ok");
        arr.add("True");
        arr.add("1");
        arr.add("No");
        System.out.println(arr);

        arr.add(5, "10"); // добавление в середину списка
        System.out.println(arr);
        arr.remove(5); // удаление элемента по индексу
        System.out.println(arr);
        System.out.println(arr.contains("0")); // проверка наличия объекта в списке
        System.out.println(arr.contains("1000")); // проверка наличия объекта в списке
        System.out.println(arr.size()); // размер массива
        ArrayList copyArr = new ArrayList();
        copyArr = (ArrayList)arr.clone();
        arr.clear();
        System.out.println("Arr: " + arr);
        System.out.println("Copy: " + copyArr);

    }
}
