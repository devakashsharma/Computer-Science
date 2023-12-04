package Java.My10_Polymorphism;

abstract class Car45 {
    // public abstract void drive (); // it is not required to create an abstract method in the abstract class.


    public abstract void drive ();
    // public abstract void fly (); // whenever we create an abstract methods then we need to define in the subclass
    public abstract void fly ();
    public void playMusic () {
        System.out.println("Playing Music");
    }
}
// but suppose we still want to create a method in abstract class but don't want to define in the inherited class then we can make that inherited class an abstract class
abstract class WagonR extends Car45 {
    public void drive () {
        System.out.println("driving");
    }
}

class updatedVersion extends WagonR { // this type of class is also known as concrete class
    public void fly () {
        System.out.println("Kore.. ga......... Jyuda");
    }
}
public class L45_abstract {
    public static void main(String[] args) {
        // Car45 obj = new Car45(); // we cannot create an object of abstract class
        // Car45 obj = new WagonR();
        Car45 obj = new updatedVersion();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
