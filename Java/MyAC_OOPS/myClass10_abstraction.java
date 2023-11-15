package Java.MyAC_OOPS;

// Abstract is a concept or we can say it is just a theory that user shouldn't have to be aware, it shows the result not the implementation
abstract class Animal {
    abstract void walk();
    public void eat() { // non-abstract method
        System.out.println("They can eat");
    }

    // Constructor chaining - we are print the constructor of a derived class but at first the base class then derived class will be print
    Animal() {
        System.out.println("Created - The idea of Animal");
    }
}
class Horse extends Animal {
    public void walk() {
        System.out.println("Walk on 4 legs");
    }
    Horse() {
        System.out.println("Created - The Actual Horse");
    }
}
class Chicken extends Animal {
    public void walk() {
        System.out.println("Walk on 2 legs");
    }
}
public class myClass10_abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
//        horse.walk();
//        horse.eat();
//        Animal animal = new Animal(); // 'Animal' is abstract; cannot be instantiated

    }
}