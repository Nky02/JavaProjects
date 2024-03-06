import java.util.Scanner;

public class SteamEngineEfficiency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double steamTemp, airTemp, maxEfficiency;

        System.out.println("Enter  steam temperature: ");
        steamTemp = scan.nextDouble();

        System.out.println("Enter air temperature: ");
        airTemp = scan.nextDouble();

        if (steamTemp < 373)
            System.out.println("Maximum possible efficiency: 0 ");

        else {
            maxEfficiency = 1 - airTemp / steamTemp;
            System.out.printf(" Maximum possible efficiency: %.2f%n", maxEfficiency);
        }
        scan.close();
    }
}
