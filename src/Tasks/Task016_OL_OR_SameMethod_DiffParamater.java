package Tasks;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Task016_OL_OR_SameMethod_DiffParamater {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sumInt = calc.add(10, 20);
        double sumDouble = calc.add(15.5, 24.5);

        System.out.println("Sum of integers: " + sumInt);
        System.out.println("Sum of doubles: " + sumDouble);
    }
}