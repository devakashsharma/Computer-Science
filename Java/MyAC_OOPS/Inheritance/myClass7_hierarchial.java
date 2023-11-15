package Java.MyAC_OOPS.Inheritance;

// Hierarchical Inheritance
class Shape3 { // base class
    String color;
    public void area() {
        System.out.println("Area");
    }
}
class Triangle3 extends Shape3 { // derived class
    public void area(int l, int h) {
        System.out.println(1/2*l*h);
    }
}
class Circle extends Shape3 {
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }
}

public class myClass7_hierarchial {
    public static void main(String[] args) {

    }
}
