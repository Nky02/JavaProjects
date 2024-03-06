import java.util.Scanner;

public class InternetDelicatessen {

    public static void main(String[] args) {
        final double regularDeliveryFee = 2.00;
        final double expressDeliveryFee = 3.00;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the item: ");
        String itemName = scan.nextLine();

        System.out.print("Enter the price: ");
        double itemPrice = scan.nextDouble();

        System.out.print("Overnight delivery (0==no, 1==yes): ");
        int deliveryInput = scan.nextInt();
        boolean delivery = deliveryInput == 1;

        double total;
        double deliveryFee;

        if (delivery) {

            if (itemPrice < 10) {
                total = itemPrice + regularDeliveryFee + expressDeliveryFee;
                deliveryFee = regularDeliveryFee + expressDeliveryFee;
            } else
                total = itemPrice + expressDeliveryFee;
            deliveryFee = expressDeliveryFee;
        } else {
            if (itemPrice < 10) {
                total = itemPrice;
                deliveryFee = 0.00;
            } else {
                total = itemPrice + regularDeliveryFee;
                deliveryFee = regularDeliveryFee;
            }
        }

        System.out.println("Invoice: ");
        System.out.printf("  %-13s %.2f%n", itemName, itemPrice);
        System.out.printf("  %-13s %.2f%n", "delivery", deliveryFee);
        System.out.printf("  %-13s %.2f%n", "total", total);
        scan.close();

    }
}
