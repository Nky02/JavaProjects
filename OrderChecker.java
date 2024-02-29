import java.util.Scanner;

public class OrderChecker {
    public static void main(String[] args) {

        final int BOLTPRICE = 5;
        final int NUTPRICE = 3;
        final int WASHERPRICE = 1;

        Scanner scan = new Scanner(System.in);

        // input of purchase
        System.out.print("Enter number of bolts: ");
        int bolts = scan.nextInt();

        System.out.print("Enter number of nuts: ");
        int nuts = scan.nextInt();

        System.out.print("Enter number of washers: ");
        int washers = scan.nextInt();

        // checking of orders
        String errorMssg = "";

        if (nuts < bolts)
            errorMssg += "Check order: Too few nuts\n";

        if (washers < (bolts * 2))
            errorMssg += "Check order: Too few washers\n";

        // output for error message
        if (errorMssg.length() > 0) {
            System.out.println("\n" + errorMssg);
        } else {
            System.out.println("\nOrder is okay");
        }

        // output for total cost
        int totalCost = BOLTPRICE * bolts + NUTPRICE * nuts + WASHERPRICE * washers;
        System.out.println("Total Cost: " + totalCost + " cents");

        scan.close();
    }
}
