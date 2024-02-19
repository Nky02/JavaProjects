package Chapter13;

import java.util.Scanner;

public class MeanCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number (X)
        System.out.println("Enter X:");
        double x = scanner.nextDouble();

        // Prompt the user to enter the second number (Y)
        System.out.println("Enter Y:");
        double y = scanner.nextDouble();

        // Calculate the arithmetic mean
        double Mean = (x + y) / 2;

        // Calculate the harmonic mean
        double harmonicMean = 2 / (1 / x + 1 / y);

        System.out.println("Arithmetic mean: " + Mean);
        System.out.println("Harmonic   mean: " + harmonicMean);

        scanner.close();
    }
}