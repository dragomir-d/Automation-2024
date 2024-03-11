package main.lec4;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, enter your age: ");

        if (scanner.hasNextInt()) {
            int age = scanner.nextInt();

            if (age > 100) {
                System.out.println("Are you sure you are not a vampire?");

            } else if (age >= 65 && age <= 100) {
                System.out.println("You are too old to work on " + age + "! Enjoy your retirement!");

            } else if (age >= 16 && age <= 64) {
                System.out.println("You are ready to work!");

            } else {
                System.out.println("You are too young to work on " + age + "! Enjoy your childhood!");
            }

        } else {
            System.out.println("Invalid age! Please try again with numbers!");
        }
    }
}
