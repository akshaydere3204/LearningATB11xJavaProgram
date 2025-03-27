package Tasks;

import java.util.Scanner;

public class Task006_FibonacciSequenceGenerator {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of terms
        System.out.print("Enter the number of Fibonacci terms: ");
        int n = scanner.nextInt();

        // Close scanner to prevent resource leak
        scanner.close();

        // Validate input
        if (n <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            // Generate Fibonacci sequence
            System.out.println("Fibonacci Sequence:");
            generateFibonacci(n);
        }
    }

    // Method to generate Fibonacci sequence
    public static void generateFibonacci(int n) {
        int first = 0, second = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " "); // Print the current Fibonacci number
            int next = first + second; // Calculate the next number
            first = second; // Update first number
            second = next; // Update second number
        }
    }
}
