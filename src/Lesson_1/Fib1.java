package Lesson_1;

//Решение через рекурсию

import java.util.Scanner;

public class Fib1 {
    public Fib1() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите порядковый номер чисел Фибоначчи от 1 до 46: ");
        int a = scanner.nextInt();
        System.out.println("Число под номером " + a + " = " + fibValue(a));
    }

    public static int fibValue(int n) {
        if (n <= 1) {
            return 0;
        } else {
            return n == 2 ? 1 : fibValue(n - 1) + fibValue(n - 2);
        }
    }
}
