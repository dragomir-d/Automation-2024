package main.OperatorsAndExpressions;

import java.util.Scanner;

public class PrintDaysOfTheWeek {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number that is between 1 and 7: ");

        if (scanner.hasNextInt()) {
            int dayNumber = scanner.nextInt();

            if (dayNumber >= 1 && dayNumber <= 7) {
                String dayOfWeek = getDayOfWeek(dayNumber);

                System.out.println("The day of the week is: " + dayOfWeek);
            } else {
                System.out.println("Invalid day number! Please try again with number between 1 and 7!");
            }
        } else {
            System.out.println("Invalid day number! Please try again with number between 1 and 7!");
        }


    }

    public static String getDayOfWeek(int dayNumber) {
        switch (dayNumber) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Invalid day number! Please try again with number between 1 and 7!";
        }
    }
}
