package Lesson_2;



public class Player2 extends Game{
    private static String name;
    private static int score;

    Player2(){
        System.out.println("Введите имя второго игрока: ");
        setName(scanner.nextLine());
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Player2.name = name;
    }

    public static int getScore() {
        return score;
    }

    public static void setScore(int score) {
        Player2.score = score;
    }

   static void movePlayer2() {
        int x, y;
        do {
            System.out.println("Введите X и Y (от 1 до 3):");
            System.out.print("X: ");
            x = scanner.nextInt() - 1;
            System.out.print("Y: ");
            y = scanner.nextInt() - 1;
        } while (!isCellEmpty(x, y));
        field[y][x] = O;
    }
}
