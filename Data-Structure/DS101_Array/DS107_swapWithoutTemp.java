package Data-Structure.DS101_Array;

public class DS107_swapWithoutTemp {
    static void swapWithoutTemp(int a, int b) {
        System.out.println("Original value before swap");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        System.out.println("Original value after swap");
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        swapWithoutTemp(a, b);
    }
}
