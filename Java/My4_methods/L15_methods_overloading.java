package Java.My4_methods;

class Calculator {
    public int add(int n1, int n2) {
        return n1 + n2;
    }
    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
    public double add(double n1, int n2) {
        return n1 + n2;
    }
}
public class L15_methods_overloading {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int num1 = cal.add(2, 3);
        int num2 = cal.add(4, 6, 2);
        double num3 = cal.add(34.2, 34);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}
