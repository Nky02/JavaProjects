package Chapter13;

import java.util.Scanner;

public class AnualApplianceCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for cost per kilowatt-hour in cents
        System.out.println("Enter cost per kilowatt-hour in cents:");
        double costPerKilowattHour = scanner.nextDouble();

        // Prompt the user for kilowatt-hours used per year
        System.out.println("Enter kilowatt-hours used per year:");
        double kilowattHoursPerYear = scanner.nextDouble();

        double annualCost = (costPerKilowattHour / 100) * kilowattHoursPerYear;

        System.out.printf("Annual cost: %.4f", annualCost);

        scanner.close();
    }
}