import java.util.Scanner;

public class MWOHeatingTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the number of items
        System.out.print("How many items to heat: ");
        int numberOfItems = scanner.nextInt();

        // Ask for the time for one item
        System.out.print("Time for one item: ");
        int timeInput = scanner.nextInt();

        // Translate the value into seconds
        int baseTimeSeconds;
        if (timeInput < 100) {
            baseTimeSeconds = timeInput; // already in seconds
        } else {
            int minutes = timeInput / 100;
            int seconds = timeInput % 100;
            baseTimeSeconds = (minutes * 60) + seconds;
        }

        int recommendedTimeSeconds = 0;

        if (numberOfItems == 1) {
            recommendedTimeSeconds = baseTimeSeconds;
        }
        if (numberOfItems == 2) {
            recommendedTimeSeconds = (int) (baseTimeSeconds * 1.5);
        }
        if (numberOfItems == 3) {
            recommendedTimeSeconds = baseTimeSeconds * 2;
        }
        if (numberOfItems > 3) {
            System.out.println("Heating more than three items at once is not recommended.");
            scanner.close();
            return; //
        }

        // Translate seconds back into minutes and seconds
        int minutes = recommendedTimeSeconds / 60;
        int seconds = recommendedTimeSeconds % 60;

        // Output the recommended heating time
        System.out.printf("Heat for %d minutes %d seconds%n", minutes, seconds);

        scanner.close();
    }
}