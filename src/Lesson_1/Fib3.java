package Lesson_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Fib3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите порядковый номер чисел Фибоначчи от 1 до 46:");
        int num = scanner.nextInt();
        System.out.println("Число под номером " + num + " = " + fib(num));
    }

    private static int fib(int a) {
        ArrayList<Integer> fibList = new ArrayList<>();
        fibList.add(0);
        fibList.add(1);

        for(int i = 2; i < a; ++i) {
            fibList.add(i, fibList.get(i - 1) + fibList.get(i - 2));
        }

        return fibList.get(a - 1);
    }
}
