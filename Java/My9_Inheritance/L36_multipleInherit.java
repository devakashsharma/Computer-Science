package Java.My9_Inheritance;

class A36 {
}
class B26 {
}
// class C extends A36 , B26 // we cannot do this
// class C36 extends A36 extends B36 // we cannot do this either

public class L36_multipleInherit {
    public static void main(String[] args) {
        // Java doesn't support multiple inheritance because of the 'Ambiguity' (which is that when we call the method but if that method is available in more than one class then from which class it will choose the method)
    }
}
