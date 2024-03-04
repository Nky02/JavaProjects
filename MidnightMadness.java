import java.util.Scanner;

public class MidnightMadness {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input
        System.out.print("Enter your age: ");
        int age = scan.nextInt();

        System.out.print("Enter the time of the movie (24-hour clock format): ");
        int time = scan.nextInt();

        // Process
        double ticketPrice;

        if (time >= 2200) {
            if (age <= 13) {
                // Children are not allowed after 10pm
                System.out.println("No tickets available for children after 10 pm.");
                scan.close();
                return;
            } else
                // Midnight Madness pricing for adults
                ticketPrice = 4.00;

        } else if (time < 1700) {
            // Matinee pricing
            if (age <= 13) {
                ticketPrice = 2.00; // Child matinee pricing
            } else {
                ticketPrice = 5.00; // Adult matinee pricing
            }
        } else {
            // Regular pricing
            if (age <= 13) {
                ticketPrice = 4.00; // Child regular pricing
            } else {
                ticketPrice = 8.00; // Adult regular pricing
            }
        }

        // Output
        System.out.println("The ticket price is: $" + ticketPrice);

        scan.close();
    }
}