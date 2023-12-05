package Java.My11_InnerClass;

class A47 {
    public void show () {
        System.out.println("In A");
    }
}
//class B47 extends A47 {
//    public void show () {
//        System.out.println("In B");
//    }
//}

public class L47_anonymousInnerClass {
    public static void main(String[] args) {
//        A47 obj = new B47();
        A47 obj = new A47() {
            public void show() {
                System.out.println("Anonymous Inner Class");
            }
        };
        obj.show();

    }
}
