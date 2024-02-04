package Data-Structure.DS101_Array;

public class DS106_swapTwoNumber {
    static void swapNum(int a, int b) {
        System.out.println("Original Value before swap");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        // Swapping
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Original Value after swap");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

    }
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        swapNum(a, b);
    }
}
