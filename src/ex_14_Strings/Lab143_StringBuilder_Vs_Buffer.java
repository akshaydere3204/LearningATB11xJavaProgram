package ex_14_Strings;

public class Lab143_StringBuilder_Vs_Buffer {
    public static void main(String[] args) {

        // String - 90%
        String s0 = "Akshay";
        String s1 = new String("Akshay");

        // less than <10% used.
        StringBuffer stringBuffer = new StringBuffer("Akshay");
        StringBuilder stringBuilder = new StringBuilder("Akshay");

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
    }
}
