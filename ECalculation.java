import java.util.Scanner;
import java.lang.Math;

public class ECalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x: ");
        double x = scanner.nextDouble();

        double approximation = Math.pow(1 + 1 / x, x);

        System.out.printf("Approximation to e: %.7f%n", approximation);

        scanner.close();
    }
}
