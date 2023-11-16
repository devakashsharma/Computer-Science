package Java.MyAC_OOPS;

interface Animal1{
    public void walk();
}

interface Herbivore {

}
class Horse1 implements Animal1, Herbivore { // multiple interface
    public void walk() {
        System.out.println("walks on 4 legs");
    }
}
public class myClass11_interface {
    public static void main(String[] args) {
        Horse1 horse1 = new Horse1();
        horse1.walk();
    }
}
