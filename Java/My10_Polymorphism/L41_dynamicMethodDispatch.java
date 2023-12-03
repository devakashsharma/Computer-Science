package Java.My10_Polymorphism;

class A41 {
    public void show() {
        System.out.println("In A");
    }
}
class B41 extends A41 {
    public void show() {
        System.out.println("In B");
    }
}
class C41 extends A41 {
    public void show () {
        System.out.println("In C");
    }
}
class D41 {
    public void show () {
        System.out.println("In D");
    }
}
public class L41_dynamicMethodDispatch {
    public static void main(String[] args) {
        A41 obj = new A41();
        obj.show();

        obj = new B41();
        obj.show();
        
        obj = new C41();
        obj.show();
        
        // obj = new D41;
        
        // The dynamic method dispatch only work on parent and subclass not the different 

    }
}
