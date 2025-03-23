package Tasks;

import java.util.Scanner;

public class Task004_f_TriangleClass {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter three sides of the triangle
        System.out.print("Enter the first side length: ");
        int side1 = scanner.nextInt();

        System.out.print("Enter the second side length: ");
        int side2 = scanner.nextInt();

        System.out.print("Enter the third side length: ");
        int side3 = scanner.nextInt();

        // Check if it's a valid triangle
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            // Classify the triangle
            if (side1 == side2 && side2 == side3) {
                System.out.println("The triangle is Equilateral (all sides are equal).");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("The triangle is Isosceles (exactly two sides are equal).");
            } else {
                System.out.println("The triangle is Scalene (no sides are equal).");
            }
        } else {
            System.out.println("Invalid triangle! The given sides do not form a valid triangle.");
        }

        // Close the scanner
        scanner.close();
    }
}
