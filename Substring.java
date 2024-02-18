/*This program asks the user for a string, a beginning index, and an ending index and then writes out the original 
    string and the new substring 
    Date: February 15, 2024
    Written by: Nicky Shane Estrada*/

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter String: ");
        String inputString = scan.nextLine();

        System.out.println("Enter beginning index: ");
        int startIndex = scan.nextInt();

        System.out.println("Enter ending index: ");
        int endIndex = scan.nextInt();

        System.out.println("Original string: ");
        System.out.println(inputString);

        System.out.println("\nSubstring: ");

        String subString = inputString.substring(startIndex, endIndex);
        System.out.println(subString);

        scan.close();

    }
}
