package Tasks;

import java.util.Scanner;

public class Task003_GradeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the numerical score
        System.out.print("Enter the numerical score: ");
        int score = scanner.nextInt();

        // Determine the letter grade
        char grade;
        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80 && score < 90) {
            grade = 'B';
        } else if (score >= 70 && score < 80) {
            grade = 'C';
        } else if (score >= 60 && score < 70) {
            grade = 'D';
        } else if (score >= 0 && score < 60) {
            grade = 'F';
        } else {
            System.out.println("Invalid score! Please enter a value between 0 and 100.");
            scanner.close();
            return;
        }

        // Display the grade
        System.out.println("The letter grade is: " + grade);

        // Close the scanner
        scanner.close();
    }
}
