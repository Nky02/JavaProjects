import java.util.Scanner;

public class DoubleAmount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the annual interest rate
        System.out.print("Enter the annual interest rate (in percentage): ");
        double interestRate = scanner.nextDouble();

        // Calculate the number of years to double the money
        double yearsToDouble = 72.0 / interestRate;

        // Output the result
        System.out.printf("It takes about %.1f years to double your money at an annual interest rate of %.1f%%.",
                yearsToDouble, interestRate);

        // Close the scanner
        scanner.close();
    }
}
