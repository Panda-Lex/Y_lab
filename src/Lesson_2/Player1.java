package Lesson_2;



public class Player1 extends Game {
    private static String name;
    private static int score = 0;

    Player1(){
        System.out.println("Введите имя первого игрока: ");
        setName(scanner.nextLine());
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Player1.name = name;
    }

    public static int getScore() {
        return score;
    }

    public static void setScore(int score) {
        Player1.score = score;
    }

    static void movePlayer1() {
        int x, y;
        do {
            System.out.println("Введите X и Y (от 1 до 3):");
            System.out.print("X: ");
            x = scanner.nextInt() - 1;
            System.out.print("Y: ");
            y = scanner.nextInt() - 1;
        } while (!isCellEmpty(x, y));
        field[y][x] = X ;
    }

}