package main.OperatorsAndExpressions;

import java.util.Scanner;

public class Sale {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double unitPrice;
        int quantity;
        boolean isValidInput = false;

        System.out.print("Enter unit price: ");
        unitPrice = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        quantity = scanner.nextInt();

        if (quantity > 0) {
            isValidInput = true;
        } else {
            System.out.println("The revenue cannot be calculated! Please try again with valid quantity!");
        }

        if (unitPrice > 0) {
            isValidInput = true;
        } else {
            System.out.println("The revenue cannot be calculated! Please try again with valid unit price!");
        }

        double income = unitPrice * quantity;
        double discount = 0;

        if (isValidInput) {
            if (quantity >= 100 && quantity <= 120) {
                discount = income * 0.15;
            } else if (quantity > 120) {
                discount = income * 0.2;
            }
        }

        if (isValidInput) {
            double totalIncome = income - discount;

            System.out.println("The revenue from sale is: $" + totalIncome);
            System.out.println("Discount: $" + discount + "(" + (discount / income) * 100 + "%)");

        }
    }
}

//Write a Java program to calculate the revenue from a sale based on the unit price and quantity of a product input by the user.
//The discount rate is 15% for the quantity purchased between 100 and 120 units, and 20% for the quantity purchased greater than 120 units.
//If the quantity purchased is less than 100 units, the discount rate is 0%.
//See the example output as shown below: Еnter unit price: 25 Enter quantity: 110 The revenue from sale: 2337.5$ Discount: 412.5$(15.0%)
