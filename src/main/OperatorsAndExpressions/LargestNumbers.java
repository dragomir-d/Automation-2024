package main.OperatorsAndExpressions;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] numberTokens = input.split("\\s+");
        int[] numbers = new int[numberTokens.length];

        int largestNum = 0;

        for (int i = 0; i < numberTokens.length; i++) {
            numbers[i] = Integer.parseInt(numberTokens[i]);

            if (largestNum < numbers[i]) {
                largestNum = numbers[i];
            }
        }
        System.out.println(largestNum);

    }
}
