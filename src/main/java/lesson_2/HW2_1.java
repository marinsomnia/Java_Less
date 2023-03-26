package lesson_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

//Создать файл с названием file.txt. Если файл уже есть, то создавать не надо Записать в него Слово "TEXT" 100 раз
public class HW2_1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("file.txt");
        PrintWriter text = new PrintWriter(file);
        text.println("TEXT".repeat(100));
        text.close();
    }
}
