package Java.MyAC_OOPS.Inheritance;

// Single Level Inheritance
class Shape1 { // base class
    String color;
    public void area() {
        System.out.println("Area");
    }
}
class Triangle1 extends Shape1 { // derived class

}
public class myClass5_singleLevel {
    public static void main(String[] args) {
    Triangle1 t1 = new Triangle1();
    t1.color = "Black";
    System.out.println(t1.color);
}
}
