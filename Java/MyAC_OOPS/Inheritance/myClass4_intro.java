package Java.MyAC_OOPS.Inheritance;

class Shape {
    String color;
}
class Triangle extends Shape {

}
public class myClass4_intro {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "Black";
        System.out.println(t1.color);
    }
}
