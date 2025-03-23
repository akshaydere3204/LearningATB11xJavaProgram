package ex_04_Operators;

public class Lab048_Interview {
    public static void main(String[] args) {
        int Akshay_salary = 12;
        boolean b = !(Akshay_salary > 10 || Akshay_salary < 5);
        System.out.println(b);

        // A - balaji_salary > 10 -> 12 > 10 -> true
        // B -> balaji_salary < 5  12 < 5 -> false
        // !(A || B) -> !(true || false) -> !true - false
    }
}
