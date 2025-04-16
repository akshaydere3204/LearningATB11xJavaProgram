package Tasks;

public class Task013_ATB_with_Encapsulation {
    private String name;
    private int age;
    private String course;

    // Constructor
    public Task013_ATB_with_Encapsulation(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // toString method
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Course: " + course;
    }
}

