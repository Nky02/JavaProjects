import java.util.Scanner;

public class Y2KProblemDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Year of Birth: ");
        int birthYear = scanner.nextInt();
        System.out.print("Current year: ");
        int currentYear = scanner.nextInt();

        if (birthYear <= currentYear) {
            birthYear += 1900;
        } else {
            birthYear += 2000;
        }

        // Calculating the age
        int age = currentYear - birthYear;

        // Outputting the result
        System.out.println("Your age: " + age);

        scanner.close();
    }
}
