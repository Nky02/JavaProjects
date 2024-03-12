import java.util.Scanner;

public class PressureBuilding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input tire pressures
        System.out.print("Input right front pressure\n");
        int rightFrontPressure = scanner.nextInt();

        System.out.print("Input left front pressure\n");
        int leftFrontPressure = scanner.nextInt();

        System.out.print("Input right rear pressure\n");
        int rightRearPressure = scanner.nextInt();

        System.out.print("Input left rear pressure\n");
        int leftRearPressure = scanner.nextInt();

        // Initialize a flag to track if inflation is ok
        boolean inflationIsOk = true;

        // Check if each tire pressure is within the allowed range
        if (rightFrontPressure < 35 || rightFrontPressure > 45
                || leftFrontPressure < 35 || leftFrontPressure > 45
                || rightRearPressure < 35 || rightRearPressure > 45
                || leftRearPressure < 35 || leftRearPressure > 45) {
            inflationIsOk = false;
        }

        // Check the difference in pressure between the front tires and the rear tires
        if (Math.abs(rightFrontPressure - leftFrontPressure) > 3
                || Math.abs(rightRearPressure - leftRearPressure) > 3) {
            inflationIsOk = false;
        }

        // Output the result
        if (inflationIsOk) {
            System.out.println("Inflation is OK");
        } else {
            System.out.println("Inflation is NOT OK");
        }

        scanner.close();
    }
}