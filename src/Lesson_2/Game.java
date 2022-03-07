package Lesson_2;

import java.io.File;
import java.util.Scanner;

class Game {
    static String[][] field;
    final static String EMPTY = "|-|";
    final static String X = "|X|";
    final static String O = "|0|";
    static Scanner scanner;

    public static void main(String[] args) {
        Game TicTacToe = new Game();
        TicTacToe.game();
    }

    public Game() {
        scanner = new Scanner(System.in);
    }
    void game(){
        new Player1();
        new Player2();
        fieldCoordinates();
        System.out.println();
        makeField();
        printField();

        while (true){
            System.out.println(Player1.getName());
            Player1.movePlayer1();
            if (checkWin(X)){
                System.out.println(Player1.getName() + " победил!");
                Player1.setScore(Player1.getScore() + 1);
                retry();
                break;
            };
            if(isDraw()){
                System.out.println("Ничья!");
                retry();
            };
            printField();
            System.out.println(Player2.getName());
            Player2.movePlayer2();
            if (checkWin(O)){
                System.out.println(Player2.getName() + " победил!");
                Player2.setScore(Player2.getScore() + 1);
                retry();
                break;
            };
            if(isDraw()){
                System.out.println("Ничья!");
                retry();
            };
            printField();
        }
    }

    void makeField(){
        field = new String[3][3];
    for (int i = 0; i < field.length; i++) {
        for (int j = 0; j < field.length ; j++) {
            field[i][j] = EMPTY;
            }
        }
    }
    void printField(){
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print(field[i][j] + " ");
        }
        System.out.println();
     }
    }
      static boolean isCellEmpty(int x, int y){
       if (x < 0 || y < 0 || x >= 3|| y >= 3)
           return false;
       return field[y][x].equals(EMPTY);
   }

     static boolean checkWin(String step) {
         for (int i = 0; i < 3; i++)
             if ((field[i][0].equals(step) && field[i][1].equals(step) && field[i][2].equals(step)) ||
                     (field[0][i].equals(step) && field[1][i].equals(step) && field[2][i].equals(step)))
                 return true;
             if ((field[0][0].equals(step) && field[1][1].equals(step) && field[2][2].equals(step)) ||
                 (field[2][0].equals(step) && field[1][1].equals(step) && field[0][2].equals(step)))
                 return true;
         return false;
     }
     static boolean isDraw(){
         for (int i = 0; i < field.length; i++) {
             for (int j = 0; j < field.length; j++) {
                 if(field[i][j].equals(EMPTY))
                     return false;
             }
         }
         return true;
     };

     static void retry(){
         System.out.println("Хотите сыграть еще раз? (1 - да, 0 - нет): ");
         int a = scanner.nextInt();
        if (a == 1){
            new Game().game();
        }
        if(a == 0){
            System.out.println("Игра окончена");
        }
     };

     static void fieldCoordinates(){
         String[][] coordinates = new String[3][3];
         System.out.println("Координаты игрового поля:");
         for (int i = 0; i < coordinates.length; i++) {
             for (int j = 0; j < coordinates.length ; j++) {
                 System.out.print("|" + (j+1) + (i+1) + "|");
             }
             System.out.println();
         }
     }



}

