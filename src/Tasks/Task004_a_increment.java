package Tasks;

public class Task004_a_increment {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);
    }
}

//Output is 34 & 13
