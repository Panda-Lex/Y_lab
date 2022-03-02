package Lesson_1;

import java.util.HashMap;
import java.util.Scanner;

public class Fib3 {
    public static HashMap<Integer,Integer> fibList;

    static {
        fibList = new HashMap<>();
        fibList.put(1,0);
        fibList.put(2,1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите порядковый номер числа Фибоначчи от 1 до 46:");
        int scan = scanner.nextInt();
        System.out.println("Число под номером " + scan + " = " + addFib(scan));
        System.out.println(fibList);
    }

    private static int addFib(int index){
        if(index <= 1)
            return 0;

        if(fibList.containsKey(index))
            return fibList.get(index);

        int a = fibList.get(fibList.size()-1), b = fibList.get(fibList.size()), num = 0;
        for (int i = fibList.size()+1; i <= index; i++) {
            num = a+b;
            a = b;
            b = num;
            fibList.put(i,num);
        }
        return num;
    }
}