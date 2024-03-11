//4. Write a Java method to count all words in a string.

package main.lec6;
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] token = scanner.nextLine().split("\\s+");

        getCountOfWords(token);
    }

    public static void getCountOfWords (String[] str) {
        System.out.println("There are " + str.length + " words.");

        for (int i = 0; i < str.length; i++) {
            int index = i + 1;
            System.out.println(index + "- " + str[i]);
        }
    }
}
