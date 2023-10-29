package Telsuko.My2_Conditional;

public class L8_ternary {
    public static void main(String[] args) {
        int num = 6;
        int result = 0;

//        if (num % 2 == 0) {
//            result = 20;
//        }
//        else {
//            result = 10;
//        }
//        System.out.println(result);

        result = num % 2 == 0 ? 20 : 10;
        System.out.println(result);

    }
}
