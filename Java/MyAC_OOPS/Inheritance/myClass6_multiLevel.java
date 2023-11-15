package Java.MyAC_OOPS.Inheritance;

// Multi Level Inheritance
class Shape2 { // base class
    String color;
    public void area() {
        System.out.println("Area");
    }
}
class Triangle2 extends Shape2 { // derived class
    public void area(int l, int h) {
        System.out.println(1/2*l*h);
    }
}
class EquilateralTriangle extends Triangle2 {
    public void area(int l, int h) {
        System.out.println("Hello there");
    }
}
public class myClass6_multiLevel {
    public static void main(String[] args) {

    }
}
