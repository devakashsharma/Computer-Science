package Java.My11_InnerClass;

class A46 {
    int age;
    public void show () {
        System.out.println("Show");
    }

        // class B46 {
        static class B46 {
        public void config () {
            System.out.println("Config");
        }
    }
}
public class L46_innerClass {
    public static void main(String[] args) {
        A46 obj = new A46();
        obj.show();

        // if we want to use inner class then we need to define like this:
        // A46.B46 obj2 = obj.new B46();

        // if we make a static inner class then we can call it direct with the class, we don't need to use objects
        A46.B46 obj2 = new A46.B46();
        obj2.config();
    }
}
