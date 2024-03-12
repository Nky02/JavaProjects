import java.util.Scanner;

public class TirePressure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input right front pressure: ");
        int rightFrontPressure = scanner.nextInt();

        System.out.print("Input left front pressure: ");
        int leftFrontPressure = scanner.nextInt();

        System.out.print("Input right rear pressure: ");
        int rightRearPressure = scanner.nextInt();

        System.out.print("Input left rear pressure: ");
        int leftRearPressure = scanner.nextInt();

        boolean frontTiresOK = rightFrontPressure == leftFrontPressure;

        boolean rearTiresOK = rightRearPressure == leftRearPressure;

        if (frontTiresOK && rearTiresOK) {
            System.out.println("Inflation is OK");
        } else {
            System.out.println("Inflation is NOT OK");
        }

        scanner.close();
    }
}