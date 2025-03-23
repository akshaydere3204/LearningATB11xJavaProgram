package Tasks;

public class Task005_a_FizzBuzz {
    public static void main(String[] args) {
        // Loop from 1 to 100
        for (int i = 1; i <= 100; i++) {
            // Check if the number is a multiple of both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // Check if the number is a multiple of 3
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // Check if the number is a multiple of 5
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // Print the number if it is not a multiple of 3 or 5
            else {
                System.out.println(i);
            }
        }
    }
}
