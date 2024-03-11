//A takes as input a non-negative integer and returns true if the number is a palindrome;
//Non-negative integer is called a palindrome if it reads forward and backward in the same way. For example, the numbers 5, 121, 3443, and 123454321 are palindromes.

package main.lec6;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        if (input >= 0) {
            System.out.println(isPalindrome(input));
        } else {
            System.out.println("Please try again with non-negative integer.");
        }

    }

    public static boolean isPalindrome(int number) {
        String numberStr = String.valueOf(number);
        StringBuilder reversedStr = new StringBuilder(numberStr).reverse();

        int reversedNumber = Integer.parseInt(reversedStr.toString());

        return number == reversedNumber;
    }
}
