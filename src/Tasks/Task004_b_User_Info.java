package Tasks;

import java.util.Scanner;

public class Task004_b_User_Info {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for Name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();  // Read the full name

        // Prompt user for Age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();  // Read integer input for age

        // Prompt user for Salary
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();  // Read decimal input for salary

        // Display the collected information
        System.out.println("\nUser Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: ₹" + salary);

        // Close the scanner
        scanner.close();
    }
}
