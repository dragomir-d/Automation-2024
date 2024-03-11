//3. Write a Java method to display the middle character of a string.

package main.lec6;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("stop")) {
            System.out.println(getMiddleChar(input));

            input = scanner.nextLine();
        }

    }

    public static String getMiddleChar(String str) {
        int length = str.length();
        int midIndex = length / 2;

        if (length % 2 == 0) {
            return str.substring(midIndex - 1, midIndex + 1);
        } else {
            return String.valueOf(str.charAt(midIndex));
        }
    }
}


