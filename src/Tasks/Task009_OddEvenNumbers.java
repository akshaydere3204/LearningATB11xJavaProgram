package Tasks;

public class Task009_OddEvenNumbers {
    public static void main(String[] args) {
        int[] arr = {10, 21, 5, 8, 50, 33, 42, 99, 24};

        System.out.println("Even Numbers:");
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        System.out.println("\nOdd Numbers:");
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }
}
