package Telsuko.My3_Loops;

public class L11_do_while {
    public static void main(String[] args) {
//        int i = 1;
        int i = 5;
        do {
            System.out.println("Hello " + i);
            i++;
        }while (i < 5);

        // so do while will run at-least once even if the condition is false
    }
}
