import java.util.Scanner;
//chapter 15
public class SinandCos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input an angle in degrees: ");
        double degrees = scanner.nextDouble();

        // Convert degrees to radians
        double radians = Math.toRadians(degrees);

        double sinTheta = Math.sin(radians);
        double cosTheta = Math.cos(radians);
        double sinSquared = sinTheta * sinTheta;
        double cosSquared = cosTheta * cosTheta;

        // Calculate the sum of sin² and cos²
        double sum = sinSquared + cosSquared;

        // Output
        System.out.printf("sin(%.2f)   is:  %.2f%n", degrees, sinTheta);
        System.out.printf("cos(%.2f)   is:  %.2f%n", degrees, cosTheta);
        System.out.printf("sin(%.2f)^2 is:  %.2f%n", degrees, sinSquared);
        System.out.printf("cos(%.2f)^2 is:  %.2f%n", degrees, cosSquared);
        System.out.printf("sum          is:  %.2f%n", sum);

        scanner.close();
    }
}
