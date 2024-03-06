import java.util.Scanner;

public class FantasyGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Yertle's Quest");

        // Ask for the character's name
        System.out.print("Enter the name of your character:\n");
        String name = scanner.nextLine();

        // Ask for the character's strength
        System.out.print("Enter strength (1-10):\n");
        int strength = scanner.nextInt();

        // Ask for the character's health
        System.out.print("Enter health (1-10):\n");
        int health = scanner.nextInt();

        // Ask for the character's luck
        System.out.print("Enter luck (1-10):\n");
        int luck = scanner.nextInt();

        // Calculate the sum of points
        int totalPoints = strength + health + luck;

        // Check if the total points exceed 15
        if (totalPoints > 15) {
            System.out.println("\nYou have given your character too many points! Default values have been assigned:");
            strength = 5;
            health = 5;
            luck = 5;
        }

        // Display the character's attributes
        System.out.println(name + ", strength: " + strength + ", health: " + health + ", luck: " + luck);

        
        scanner.close();
    }
}