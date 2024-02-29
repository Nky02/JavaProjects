import java.util.Scanner;

public class GrndBeefValueCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for user input
        System.out.print("Price per pound package A: ");
        double priceA = scanner.nextDouble();

        System.out.print("Percent lean package A: ");
        double leanA = scanner.nextDouble();

        System.out.print("Price per pound package B: ");
        double priceB = scanner.nextDouble();

        System.out.print("Percent lean package B: ");
        double leanB = scanner.nextDouble();

        // Calculate the cost per pound of lean beef for each package
        double costPerPoundLeanA = priceA / (leanA / 100);
        double costPerPoundLeanB = priceB / (leanB / 100);

        // Determine the best value
        String bestValue;
        if (costPerPoundLeanA < costPerPoundLeanB) {
            bestValue = "Package A is the best value";
        } else {
            bestValue = "Package B is the best value";
        }
        // output
        System.out.printf("Package A cost per pound of lean: %.2f\n", costPerPoundLeanA);
        System.out.printf("Package B cost per pound of lean: %.2f\n", costPerPoundLeanB);
        System.out.println(bestValue);

        scanner.close();
    }
}