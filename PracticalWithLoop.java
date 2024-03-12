/*Written by: Nicky Shane Estrada 
 Practical Exam*/

import java.util.Scanner;

public class PracticalWithLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter an integer(0-35): ");

            int integer = scan.nextInt();

            if (integer < 9)

                System.out.println(integer);

            else if (integer > 9 && integer <= 35) {

                char letter = (char) ('A' + (integer - 10));
                System.out.println(letter);
            } else

                System.out.println("Invalid input. Please enter a number between 0 and 35.");

            System.out.println("Do you want to enter another number? (Y/N): ");
            char answer = scan.next().charAt(0);

            if (Character.toUpperCase(answer) == 'N')
                break;
            else if (Character.toUpperCase(answer) != 'Y')
                break;

        }

        scan.close();
    }
}