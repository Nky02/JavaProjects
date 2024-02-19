package Chapter13;

import java.util.Scanner;

public class LogCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a double
        System.out.println("Enter a double:");
        double userInput = scanner.nextDouble();

        // Calculate base 2 logarithm using the provided formula
        double base2Log = Math.log(userInput) / Math.log(2);

        System.out.println("Base 2 log of " + userInput + " is " + base2Log);

        scanner.close();
    }
}