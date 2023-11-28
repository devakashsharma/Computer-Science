package Java.My9_Inheritance;

//class A extends Object { // it is calling the object class, even if we don't see
class A {
    public A() {
        super(); // every super class is calling to the object class
        System.out.println("in A");
    }
    public A(int n) {
        super();
        System.out.println("A int"); // it will not print until we pass value of n, even if we pass value of para constructor of B but A para const will not be print
    }
}
class B extends A {
    public B() {
        super(); // this super shows, print the super class first then this subclass
//        super(5); // it will print the para const
        System.out.println("A constructor go to the super and subclass it means, it will print the both parent and child class ");
    }

    public B(int n) {
        // super(n); // it will also print the para const A
//        System.out.println("A constructor go to the super and subclass and this is int B");
//        if we want to print A, B, int B then we can use this
        this();
        System.out.println("in B int");
    }
}
public class L32_this_super {
    public static void main(String[] args) {
//        A obj1 = new A();
        B obj2 = new B(5); // it will print both class and subclass
//        B obj2 = new B(3); 

    }
}
