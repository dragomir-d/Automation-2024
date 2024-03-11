//2. Write a Java method to compute the average of three numbers.

package main.lec6;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Math.round;

public class ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        System.out.println(getAverage(num1, num2, num3));
    }
    public static double getAverage(int a, int b, int c) {
        double average = (a + b + c) / 3.0;
        //Използваме класа DecimalFormat, за да върнем числото с 2 цифри след пл. запетая. Без df резултатът ще е с 16 цифри след пл. запетая.
        DecimalFormat df = new DecimalFormat("#.##");

        return Double.parseDouble(df.format(average));
    }
}
