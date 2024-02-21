import java.util.Scanner;

public class DepositValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for initial deposit, interest rate, times interest is calculated
        // per year, and number of years
        System.out.print("Initial deposit: ");
        double P = scanner.nextDouble();

        System.out.print("Interest rate (as fraction, e.g., 0.05): ");
        double r = scanner.nextDouble();

        System.out.print("Times per year interest is calculated: ");
        double n = scanner.nextDouble();

        System.out.print("Number of years: ");
        double t = scanner.nextDouble();

        // Calculate the value of the deposit
        double V = P * Math.pow(1 + r / n, n * t);

        // Output the result
        System.out.printf("Value: $%.2f", V);

        scanner.close();
    }
}
