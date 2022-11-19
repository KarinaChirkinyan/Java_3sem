// освоение основных конструкций языка Java, ввод/вывод данных

package lab_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scanner.nextInt();
        Factorial factorial = new Factorial();
        System.out.println("Факториал равен: " + factorial.getFactorial(n));
    }
}
