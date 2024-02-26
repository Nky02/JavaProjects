import java.util.Scanner;
import java.lang.Math;

public class TrigIdentity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an angle: ");
        double degrees = scan.nextDouble();

        double radians = Math.toRadians(degrees);
        double sinValue = Math.sin(radians);
        double cosValue = Math.cos(radians);
        double sinSquared = sinValue * sinValue;
        double cosSquared = cosValue * cosValue;
        double sum = sinSquared + cosSquared;

        System.out.printf("sin(%.2f)   is:  %.2f%n", degrees, sinValue);
        System.out.printf("cos(%.2f)   is:  %.2f%n", degrees, cosValue);
        System.out.printf("sin(%.2f)^2 is:  %.2f%n", degrees, sinSquared);
        System.out.printf("cos(%.2f)^2 is:  %.2f%n", degrees, cosSquared);
        System.out.printf("sum          is:  %.2f%n", sum);

        scan.close();
    }
}
