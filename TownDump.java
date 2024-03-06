import java.util.Scanner;

public class TownDump {

    public static void main(String[] args) {
        // Constants for the costs and weight limits
        final int BASE_WEIGHT_LIMIT = 200; // pounds
        final int BASE_COST = 20; // dollars
        final int ADDITIONAL_COST_PER_100_POUNDS = 8; // dollars

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the weight of the trash in pounds: ");
        int weightOfTrash = scanner.nextInt();

        // Initialize the total cost with the base cost
        int totalCost = BASE_COST;

        // Calculate the additional cost if the weight exceeds the base limit
        if (weightOfTrash > BASE_WEIGHT_LIMIT) {
            // Calculate the weight that exceeds the base weight limit
            int additionalWeight = weightOfTrash - BASE_WEIGHT_LIMIT;
            // Calculate the additional cost for the extra weight
            int additionalCost = (additionalWeight / 100) * ADDITIONAL_COST_PER_100_POUNDS;
            // If there is a remainder, add one more charge for the additional cost
            if (additionalWeight % 100 != 0) {
                additionalCost += ADDITIONAL_COST_PER_100_POUNDS;
            }
            // Add the additional cost to the total cost
            totalCost += additionalCost;
        }

        // Output the total charge
        System.out.println("The total charge for disposing of " + weightOfTrash + " pounds of trash is: $" + totalCost);

        scanner.close();

    }
}