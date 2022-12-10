package pract_7;
import java.util.ArrayDeque;
import java.util.Scanner;

/*
Напишите программу в виде консольного приложения, которая
моделирует карточную игру «пьяница» и определяет, кто выигрывает. В игре
участвует 10 карт, имеющих значения от 0 до 9, большая карта побеждает
меньшую; карта «0» побеждает карту «9»
Входные данные.
Программа получает на вход две строки: первая строка содержит 5 карт
первого игрока, вторая - 5 карт второго игрока. Карты перечислены сверху вниз,
то есть каждая строка начинается с той карты, которая будет открыта первой.
Выходные данные.
Программа должна определить, кто выигрывает при данной раздаче, и
вывести слово first или second, после чего вывести количество ходов, сделанных
до выигрыша. Если на протяжении 106 ходов игра не заканчивается, программа
должна вывести слово botva.

Упражнение 3. Используйте для организации хранения структуру данных Dequeue
*/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayDeque<Integer> qu1 = new ArrayDeque<>(), qu2 = new ArrayDeque<>();
        int a, j = 0;
        System.out.println("Карты первого игрока");
        for(int i = 0; i < 5; i++){
            a = (int) (Math.random()*10);
            qu1.addLast(a);
            System.out.println(a);
        }
        System.out.println("Карты второго игрока");
        for(int i = 0; i < 5; i++){
            a = (int) (Math.random()*10);
            qu2.addLast(a);
            System.out.println(a);
        }
        System.out.println("--------------------------------");
        while (j != 106 && !qu1.isEmpty() && !qu2.isEmpty()){
            if (qu1.getFirst() > qu2.getFirst()){
                qu1.addLast(qu1.pollFirst());
                qu1.addLast(qu2.pollFirst());
            } else {
                qu2.addLast(qu1.pollFirst());
                qu2.addLast(qu2.pollFirst());
            }

            if (qu1.isEmpty()){
                System.out.println("first " + (j + 1) + " ход");
            } else if (qu2.isEmpty()){
                System.out.println("second " + (j + 1) + " ход");
            }
            j++;
        }
        if(j >= 106) System.out.println("botva");
    }
}
