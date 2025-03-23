package Tasks;

import java.util.Scanner;

public class Task004_e_EvenOddChecker {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is even or odd using the modulus operator (%)
        String result = (number % 2 == 0) ? "Even" : "Odd";

        // Display the result
        System.out.println("The number " + number + " is " + result);

        // Close the scanner
        scanner.close();
    }
}
