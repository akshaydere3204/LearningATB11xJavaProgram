package ex_04_Operators;

public class Lab043_Interview_Concat_Plus {

    public static void main(String[] args) {
        String first_name = "Akshay";
        String last_name = " Dere ";

        int a = 60;
        int b = 40;

        System.out.println(first_name + last_name + a + b);
        // // PramodDutta1010 - first operator - + performed as Concatenation

        System.out.println(a + b + first_name + last_name);


        System.out.println(first_name + last_name + (a + b));

        // BODMAS - Bracket of Div, mul, add, sub




    }
}
