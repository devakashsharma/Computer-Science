package Java.My9_Inheritance;

class A37 {
    public void show() {
        System.out.println("In A show");
    }
    public void config() {
        System.out.println("In A config");
    }
}
class B37 extends A37 {
    public void show() {
        System.out.println("In B show");
    }
}
public class L37_methodsOverriding {
    public static void main(String[] args) {
        B37 obj = new B37();
        obj.show();
        obj.config();
    }
}
