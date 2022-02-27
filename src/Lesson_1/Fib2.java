package Lesson_1;

//Решение через цикл

import java.util.Scanner;

public class Fib2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите порядковый номер чисел Фибоначчи от 1 до 46:");
        int scan = scanner.nextInt();
        int num0 = 0;
        int num1 = 1;
        System.out.print(num0 + " " + num1 + " ");

        for(int i = 3; i <= scan; ++i) {
            int num2 = num0 + num1;
            System.out.print(num2 + " ");
            num0 = num1;
            num1 = num2;
        }

    }
}
