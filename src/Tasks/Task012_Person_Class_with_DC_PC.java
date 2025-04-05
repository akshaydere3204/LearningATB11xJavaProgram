package Tasks;

public class Task012_Person_Class_with_DC_PC {

    // Instance fields
    String name;
    int age;
    String address;
    String phone;
    boolean isMale;

    // Default Constructor (DC)
    public Task012_Person_Class_with_DC_PC() {
        name = "Unknown";
        age = 0;
        address = "Not specified";
        phone = "N/A";
        isMale = true;
    }

    // Parameterized Constructor (PC)
    public Task012_Person_Class_with_DC_PC(String name, int age, String address, String phone, boolean isMale) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.isMale = isMale;
    }

    // Behavior methods
    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void walk() {
        System.out.println(name + " is walking.");
    }

    public void doHome() {
        System.out.println(name + " is doing home activities.");
    }

    public void printDetails() {
        System.out.println("----- Person Details -----");
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("Address : " + address);
        System.out.println("Phone   : " + phone);
        System.out.println("Gender  : " + (isMale ? "Male" : "Female"));
        System.out.println("--------------------------");
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Using Default Constructor
        Task012_Person_Class_with_DC_PC person1 = new Task012_Person_Class_with_DC_PC();
        person1.printDetails();
        person1.eat();
        person1.sleep();

        // Using Parameterized Constructor
        Task012_Person_Class_with_DC_PC person2 = new Task012_Person_Class_with_DC_PC("Akshay Dere", 30, "Bajaj Nagar, MHADA COLONY", "8668213204", true);
        person2.printDetails();
        person2.walk();
        person2.doHome();
    }
}
