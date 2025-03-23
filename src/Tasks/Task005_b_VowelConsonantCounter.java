package Tasks;

import java.util.Scanner;

public class Task005_b_VowelConsonantCounter {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert the string to lowercase to handle both uppercase and lowercase letters
        input = input.toLowerCase();

        // Initialize vowel and consonant counters
        int vowels = 0, consonants = 0;

        // Define vowel characters
        String vowelsList = "aeiou";

        // Loop through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                if (vowelsList.indexOf(ch) != -1) { // Check if it's a vowel
                    vowels++;
                } else { // Otherwise, it's a consonant
                    consonants++;
                }
            }
        }

        // Print the results
        System.out.println("Number of Vowels: " + vowels);
        System.out.println("Number of Consonants: " + consonants);

        // Close the scanner
        scanner.close();
    }
}
