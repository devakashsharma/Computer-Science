package Java.My9_Inheritance;

// import Telsuko.My8_Encapsulation.L28_encap;
class newCar {
    public void show() {
        System.out.println("Showing");
    }
}
public class L39_accessModifier {
    public static void main(String[] args) {
        L28_encap obj = new L28_encap();
        obj.Name();
        System.out.println(obj.num); // make the variable public in order to use it in outside the package
        newCar obj2 = new newCar();
        obj2.show();

        // public - we can access outside the package - same class, same package subclass and non-subclass, different package subclass and non-subclass
        // private - we can access in the only same class
        // default - we can access it in the same class, same package
        // protected - we can access it in the same class, same package subclass and non-class, different package but subclass not non-subclass|

        // Try to avoid default class, most of the time use public
    }
}
