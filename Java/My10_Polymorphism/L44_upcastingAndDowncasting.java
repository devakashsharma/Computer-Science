package Java.My10_Polymorphism;

class A44 {
    public void show () {
        System.out.println("In A");
    }
}
class B44 extends A44 {
    public void show2 () {
        System.out.println("In B");
    }
}
public class L44_upcastingAndDowncasting {
    public static void main(String[] args) {
        // A44 obj = new A44();

        // Upcasting
        // A44 obj = (A44) new B44(); // in this we are type casting it and casting the value to upside and it is known as upcasting
        A44 obj = new B44();
        obj.show();

        // Downcasting
        B44 obj2 = (B44) obj;
        obj2.show2();
    }
}
