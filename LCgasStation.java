import java.util.Scanner;

public class LCgasStation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // inputs from the user
        System.out.print("Tank capacity (in gallons): ");
        int tankCapacity = scanner.nextInt();

        System.out.print("Gage reading (in percent): ");
        int gageReading = scanner.nextInt();

        System.out.print("Miles per gallon: ");
        int milesPerGallon = scanner.nextInt();

        // Calculate gallons of fuel remaining
        int gallonsRemaining = (tankCapacity * gageReading) / 100;

        // Calculate the miles the car can travel with the remaining fuel
        int milesCanTravel = gallonsRemaining * milesPerGallon;

        // Evaluate the miles that can be traveled with the distance to the next gas
        // station
        if (milesCanTravel < 200)

            System.out.println("Get Gas!");

        else
            System.out.println("Safe to Proceed");

        scanner.close();
    }
}