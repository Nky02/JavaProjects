package Chapter13;

import java.util.Scanner;

public class BrickFallingDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constant for the acceleration due to gravity in ft/s^2
        final double g = 32.174;

        // Prompt the user for the time in seconds
        System.out.println("Enter the number of seconds:");
        double timeInSeconds = scanner.nextDouble();

        // Calculate the distance
        double distance = (0.5) * g * Math.pow(timeInSeconds, 2);

        System.out.printf("Distance: %.3f feet\n", distance);

        scanner.close();
    }
}
