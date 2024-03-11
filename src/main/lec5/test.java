package main.lec5;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> ch = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("stop")) {
            ch.add(input);

            input = scanner.nextLine();
        }

    }
}
