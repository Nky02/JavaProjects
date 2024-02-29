import java.util.Scanner;

public class PieEatingContest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constants for the weight range
        final int MIN_WEIGHT = 250 - 30; // lower bound weight
        final int MAX_WEIGHT = 250 + 30; // upper bound weight

        // Prompt the user for the contestant's weight
        System.out.print("Please enter the contestant's weight in pounds: ");
        int weight = scanner.nextInt();

        // Determine if the weight is within the range
        if (weight >= MIN_WEIGHT && weight <= MAX_WEIGHT)

            System.out.println("The contestant is allowed in the heavyweight division contest.");
        else
            System.out.println("The contestant is NOT allowed in the heavyweight division contest.");

        scanner.close();
    }
}