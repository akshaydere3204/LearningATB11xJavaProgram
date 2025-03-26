package Tasks;

public class Task_007_Diff_between_String_SB_SBuilder {
    public static void main(String[] args) {


//1. String (Immutable)
//    Immutable: Once a String object is created, it cannot be changed.
//    Stored in String Pool: When a String is created using a literal ("Hello"), it is stored in the String pool, which optimizes memory usage.
//    Performance: Since it is immutable, every modification (concatenation, replacement, etc.) creates a new object, which can be inefficient.
//    Thread Safety: Immutable objects are thread-safe by default.
//    Example:

    String s1 = "Hello";
    s1 = s1 + " Akshay";  // Creates a new String object
    System.out.println(s1);  // Output: Hello Akshay


//    2. StringBuffer (Mutable & Thread-Safe)
//    Mutable: Unlike String, StringBuffer allows modifications without creating new objects.
//            Thread-Safe: It is synchronized, meaning multiple threads can access it safely, but this adds performance overhead.
//        Performance: Slower than StringBuilder due to synchronization.
//    Example:
    StringBuffer sb = new StringBuffer("Hi");
    sb.append(" Akshay");  // Modifies the same object
    System.out.println(sb);  // Output: Hello World

//    3. StringBuilder (Mutable & Fast, but Not Thread-Safe)
//    Mutable: Like StringBuffer, it allows modifications.
//    Not Thread-Safe: It is not synchronized, making it faster than StringBuffer but unsuitable for multi-threaded environments.
//    Performance: The best choice when working with a single thread and needing high performance.
//    Example:
    StringBuilder sc = new StringBuilder("Hey");
sc.append(" Akshay");  // Modifies the same object
System.out.println(sc);  // Output: Hello World


}
}