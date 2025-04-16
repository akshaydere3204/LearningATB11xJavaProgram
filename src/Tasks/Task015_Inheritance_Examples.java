package Tasks;

    // Single Inheritance
    class A {
        void displayA() {
            System.out.println("Class A Method");
        }
    }

    class B extends A {
        void displayB() {
            System.out.println("Class B Method");
        }
    }

    // Multilevel Inheritance
    class X {
        void showX() {
            System.out.println("Class X");
        }
    }

    class Y extends X {
        void showY() {
            System.out.println("Class Y");
        }
    }

    class Z extends Y {
        void showZ() {
            System.out.println("Class Z");
        }
    }

    // Hierarchical Inheritance
    class Parent {
        void showParent() {
            System.out.println("Parent class method");
        }
    }

    class Child1 extends Parent {
        void showChild1() {
            System.out.println("Child1 method");
        }
    }

    class Child2 extends Parent {
        void showChild2() {
            System.out.println("Child2 method");
        }
    }

    public class Task015_Inheritance_Examples {
        public static void main(String[] args) {
            // Single Inheritance Example
            B objB = new B();
            objB.displayA();
            objB.displayB();

            System.out.println("---------------------");

            // Multilevel Inheritance Example
            Z objZ = new Z();
            objZ.showX();
            objZ.showY();
            objZ.showZ();

            System.out.println("---------------------");

            // Hierarchical Inheritance Example
            Child1 c1 = new Child1();
            c1.showParent();
            c1.showChild1();

            System.out.println("---------------------");

            Child2 c2 = new Child2();
            c2.showParent();
            c2.showChild2();
        }
    }