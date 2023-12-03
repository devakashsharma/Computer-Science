package Java.My10_Polymorphism;

// final keyword is use in variables, methods, class

//final class Calc42 {
class Calc42 {
    public final void show () {
        System.out.println("By Akash");
    }
    public void add (int n1, int n2) {
        System.out.println(n1 + n2);
    }
}
//class AdvCalc42 extends Calc42 { } // we cannot extend this because of the final


// anyone can override it so final in methods stop overriding
class AdvCalc42 extends Calc42 {
//    public void show () {
//        System.out.println("By Yagami");
//    }
}
public class L42_final {
    public static void main(String[] args) {
        final int num = 7;
//        num = 77;
        System.out.println(num);

        Calc42 obj = new Calc42();
        obj.show();
        obj.add(2, 4);


        AdvCalc42 obj2 = new AdvCalc42();
        obj2.show();
        obj2.add(5, 4);
        // final in variables - we cannot change the value after declaring final.
        // final in methods - it will stop the overriding.
        // final in class - we cannot inherit the class, means we are stopping it from inheritance.
    }
}
