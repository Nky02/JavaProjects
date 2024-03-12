import java.util.Scanner;

public class CheckChange {
    public static final double SERVICE_CHARGE_PER_CHECK = 0.15;

    public static void main(String[] args) {
        double serviceCharge;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the balance of your checking account : ");
        double checkBalance = scan.nextDouble();

        System.out.println("Enter the balance of your savings account : ");
        double savingsBalance = scan.nextDouble();

        System.out.println("How many checks do you want to write?: ");
        int numberOfChecks = scan.nextInt();

        if (checkBalance >= 1000 || savingsBalance >= 1500)
            System.out.println("No service charge for this account.");

        else {
            serviceCharge = numberOfChecks * SERVICE_CHARGE_PER_CHECK;
            System.out.printf("Your service charge for writing %d checks is: $%.2f\n", numberOfChecks, serviceCharge);
        }

        scan.close();

    }
}