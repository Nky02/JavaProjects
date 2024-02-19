import java.util.Scanner;

public class Kilowats {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double kilowattHoursPerHour, kilowattHoursPerYear, annualCost;

        System.out.println("Enter cost per kilowatt-hour  in cents: ");
        kilowattHoursPerHour = scan.nextDouble();

        System.out.println("Enter kilowatt-hours used per year: ");
        kilowattHoursPerYear = scan.nextDouble();

        annualCost = (kilowattHoursPerHour / 100) * kilowattHoursPerYear;
        System.out.printf("Annual cost: %.4f", annualCost);

        scan.close();
    }
}
