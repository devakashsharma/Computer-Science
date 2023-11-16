package Java.MyAC_OOPS;

interface Animal1 {
    int eyes = 2; // we can change the value, if we declared, it will be static meean value will be common to all class, it will be availabel to all (public) and the value will be fixed, we cannot change it in the future
    void walk();
}

interface Herbivore {
}

class Horse1 implements Animal1, Herbivore { // multiple inheritance
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
