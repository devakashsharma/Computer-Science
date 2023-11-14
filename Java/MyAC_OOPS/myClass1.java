package Java.MyAC_OOPS;

class Pen {

    // they are the data which means int, String
    String color;
    String type;

    // and they are the member means methods
    public void write() {
        System.out.println("Writing Something ");
    }

    public void printPenColor() {
        System.out.println(this.color);
    }
}
public class myClass1 {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Gel";

        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.type = "Ball";

        pen1.write();
        pen1.printPenColor();
        pen2.printPenColor();
    }
}
