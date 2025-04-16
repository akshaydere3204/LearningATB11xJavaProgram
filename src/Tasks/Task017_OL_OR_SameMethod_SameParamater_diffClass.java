package Tasks;

// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

// Child class
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Task017_OL_OR_SameMethod_SameParamater_diffClass {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        genericAnimal.sound(); // Calls Animal's method

        Dog dog = new Dog();
        dog.sound(); // Calls overridden method in Dog

        Animal dogAsAnimal = new Dog();
        dogAsAnimal.sound(); // Polymorphic call - will call Dog's method
    }
}
