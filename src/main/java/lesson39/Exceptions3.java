package lesson39;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions3 {
    public static void main(String[] args) {
        // Checked Exception (Compile time exception) = исключительные случаи в работе программы
        // Unchecked (Runtime exception) = ошибка в работе программы

        /* (1)
        File file = new File("test");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("abcd");
        }
        */

        // int a = 1 / 0; (2)

        // String name = null; (3)
        // name.length(); (3)

        try {
            int[] arr = new int[2];
            System.out.println(arr[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}