package ex_14_Strings;

public class Lab146_Sbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello ");
        sb.append(" World"); // Appends text
        sb.reverse();
        System.out.println(sb);
    }
}
