import java.util.Scanner;

public class CalculateArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter radius value: ");

        double radius = scan.nextDouble();
        double area = Math.PI * radius * radius;

        System.out.println("The area of the circle is: " + area);

        scan.close();

    }
}