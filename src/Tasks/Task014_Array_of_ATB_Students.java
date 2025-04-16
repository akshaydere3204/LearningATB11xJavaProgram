package Tasks;

public class Task014_Array_of_ATB_Students {
    public static void main(String[] args) {
        Task013_ATB_with_Encapsulation[] students = new Task013_ATB_with_Encapsulation[3];

        students[0] = new Task013_ATB_with_Encapsulation("Alice", 22, "Java");
        students[1] = new Task013_ATB_with_Encapsulation("Bob", 25, "Python");
        students[2] = new Task013_ATB_with_Encapsulation("Charlie", 23, "Testing");

        for (Task013_ATB_with_Encapsulation student : students) {
            System.out.println(student); // uses toString()
        }
    }
}
