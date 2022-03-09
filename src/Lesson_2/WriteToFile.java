package Lesson_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class WriteToFile {


    void writeScore() throws FileNotFoundException {
         File scoreTable = new File("ResultTable");
         PrintWriter printWriter = new PrintWriter(new FileOutputStream(scoreTable,true));
         printWriter.println(Player1.getName() + " - " + " счёт: " + Player1.getScore());
         printWriter.println(Player2.getName() + " - " + " счёт: " + Player2.getScore());
         printWriter.close();
    }
}
