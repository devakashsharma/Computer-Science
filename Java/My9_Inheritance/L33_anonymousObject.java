package Java.My9_Inheritance;

class AnonObj {
    public AnonObj() {
        System.out.println("Constructor created");
    }
    public void show() {
        System.out.println("showing");
    }
}
public class L33_anonymousObject {
    public static void main(String[] args) {
//        AnonObj obj = new AnonObj();
//        AnonObj obj; // reference creation
//        obj = new AnonObj(); // creating an object and assigning the value

//        obj.show();
//        new AnonObj(); // object is created, and it is called Anonymous Object
//      but there is one problem with this anonymous object and that is we can only use this object once, not multiple time as we need
        new AnonObj().show();
        new AnonObj().show(); // it created a new object
    }
}
