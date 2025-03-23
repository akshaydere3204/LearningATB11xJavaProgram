package Tasks;

public class Task002_Math_Expression {
    public static void main(String[] args) {
        // Given values
        int x = 10;
        int y = 10;
        int z = 10;

        // Calculate the expression: ∛(x² + y² - |z|)
        double result = Math.cbrt(Math.pow(x, 2) + Math.pow(y, 2) - Math.abs(z));

        // Display the result
        System.out.println("Result: " + result);
    }
}
