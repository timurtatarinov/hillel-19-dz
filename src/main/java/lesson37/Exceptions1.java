package lesson37;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args) {
        /* (1)
        File file = new File("test37");

        try {
            Scanner scanner = new Scanner(file);

            System.out.println("После Scanner'а.");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        }

        System.out.println("После блока try catch.");
        */

        try {
            readFile();
        } catch (FileNotFoundException e) {
            //System.out.println("Обработка исключения в методе main.");
            e.printStackTrace();
        }
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("abcd");
        Scanner scanner = new Scanner(file);
    }
}