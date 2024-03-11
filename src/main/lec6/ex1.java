
//1. Write a Java method to find the smallest number among three numbers
//2. Write a Java method to compute the average of three numbers.
//3. Write a Java method to display the middle character of a string.
//Note:
//a) If the length of the string is even there will be two middle characters.
//b) If the length of the string is odd there will be one middle character.
//     Write a Java method to count all words in a string.
//4. Write a method named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise.
//5. A takes as input a non-negative integer and returns true if the number is a palindrome;
//Non-negative integer is called a palindrome if it reads forward and backward in the same way. For example, the numbers 5, 121, 3443, and 123454321 are palindromes.

package main.lec6;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        System.out.println(getSmallestNum(num1, num2, num3));

    }
    public static int getSmallestNum(int a, int b, int c) {
        int smallest = a;

        if (b < smallest) {
            smallest = b;
        }

        if (c < smallest) {
            smallest = c;
        }

        return smallest;
    }
}
