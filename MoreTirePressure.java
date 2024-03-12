import java.util.Scanner;

public class MoreTirePressure {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean goodPressure = true;

        // Check right front tire pressure
        System.out.println("Input right front pressure");
        int rightFront = scan.nextInt();
        if (rightFront < 35 || rightFront > 45) {
            System.out.println("Warning: pressure is out of range");
            goodPressure = false;
        }

        // Check left front tire pressure
        System.out.println("Input left front pressure");
        int leftFront = scan.nextInt();
        if (leftFront < 35 || leftFront > 45) {
            System.out.println("Warning: pressure is out of range");
            goodPressure = false;
        }

        // Check right rear tire pressure
        System.out.println("Input right rear pressure");
        int rightRear = scan.nextInt();
        if (rightRear < 35 || rightRear > 45) {
            System.out.println("Warning: pressure is out of range");
            goodPressure = false;
        }

        // Check left rear tire pressure
        System.out.println("Input left rear pressure");
        int leftRear = scan.nextInt();
        if (leftRear < 35 || leftRear > 45) {
            System.out.println("Warning: pressure is out of range");
            goodPressure = false;
        }

        if (goodPressure && rightFront == leftFront && rightRear == leftRear && rightFront == rightRear) {
            System.out.println("Inflation is OK");
        } else {
            System.out.println("Inflation is BAD");
            if (!goodPressure) {
                System.out.println("Error: One or more tires are out of the recommended pressure range.");
            }
        }

        scan.close();
    }
}