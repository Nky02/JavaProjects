
/*This program is a grading system that  asks  the user for the average grade in quizzes, labworks, 
and midterm and final examinations. Then, calculates the overall grade for eihter midterm or finals 
Date: March 29, 2024
Written by: Nicky Shane Estrada*/
import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Declare constants for grade weights
        final double QUIZ_WEIGHT_PERCENTAGE = 0.20;
        final double LABWORKS_GRADE_PERCENTAGE = 0.40;
        final double TERM_EXAMINATION_PERCENTAGE = 0.40;

        int option = 0;
        String remarks;
        double quizGrade, labworksGrade, midtermExamGrade, finalExamGrade, courseGrade;
        System.out.println("\tGrading System\n\nWelcome!");

        displayOptions();

        while (option != 3) {
            option = scan.nextInt();

            // if statement for calculating midterm grade
            if (option == 1) {

                // prompts user for the average grade in quizzes, labworks, and midterm exam
                System.out.print("Enter your quiz grade: ");
                quizGrade = scan.nextDouble();

                System.out.print("Enter your grade in labworks: ");
                labworksGrade = scan.nextDouble();

                System.out.print("Enter your midterm examination grade: ");
                midtermExamGrade = scan.nextDouble();

                // calculates the overall midterm grade based on the three categories for grade
                // computation
                courseGrade = (quizGrade * QUIZ_WEIGHT_PERCENTAGE) + (labworksGrade * LABWORKS_GRADE_PERCENTAGE)
                        + (midtermExamGrade * TERM_EXAMINATION_PERCENTAGE);
                System.out.printf("Midterm Grade: %.1f\n", courseGrade);// prints the grade

                // determines if the computed grade passed or failed
                remarks = courseGrade <= 3.0 ? "Passed" : "Failed";
                System.out.println("Remarks: " + remarks);
            }

            // if statement for calculating final grade
            else if (option == 2) {

                // prompts user for the average grade in quizzes, labworks, and final term exam
                System.out.print("Enter your quiz grade: ");
                quizGrade = scan.nextDouble();

                System.out.print("Enter your grade in labworks: ");
                labworksGrade = scan.nextDouble();

                System.out.print("Enter your final examination grade: ");
                finalExamGrade = scan.nextDouble();

                // calculates the overall final based on the three categories for grade
                // computation
                courseGrade = (quizGrade * QUIZ_WEIGHT_PERCENTAGE) + (labworksGrade * LABWORKS_GRADE_PERCENTAGE)
                        + (finalExamGrade * TERM_EXAMINATION_PERCENTAGE);
                System.out.printf("Final Grade: %.1f\n", courseGrade);// prints the grade

                // determines if the computed grade passed or failed
                remarks = courseGrade <= 3.0 ? "Passed" : "Failed";
                System.out.println("Remarks: " + remarks);
            }

            else if (option == 3) {
                // asks if for exit confirmation
                System.out.println("Are you sure you want to quit? (Press 'Y' for yes or 'N' for no): ");
                char answer = scan.next().charAt(0);

                if (Character.toUpperCase(answer) == 'Y') {
                    System.out.println("Exiting the Program...");
                    break;
                } else {
                    // if the user enters N(o), this method is called again
                    displayOptions();
                }
            } else {
                System.out.println("Invalid input. Please press among the number choices.");
            }

            // if the user enters invalid number, this method is called again
            displayOptions();
        }

        scan.close();
    }

    // separate method for prompt options
    public static void displayOptions() {
        System.out.println("\nPlease select among the options below to continue");
        System.out.println("[1] Compute Midterm Grade");
        System.out.println("[2] Compute Final Grade");
        System.out.println("[3] Quit App\n");
        System.out.print("Press the number corresponding to your choice: ");
    }
}
