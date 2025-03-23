package Tasks;

public class Task004_c_MaxNumber_UsingTernaryOperator {
    public static void main(String[] args) {
        // Check if two arguments are provided
        if (args.length < 2) {
            System.out.println("Please provide two numbers as arguments.");
            return;
        }

        // Parse the arguments into integers
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        // Find the maximum using the ternary operator
        int max = (num1 > num2) ? num1 : num2;

        // Display the result
        System.out.println("The maximum number is: " + max);
    }
}
