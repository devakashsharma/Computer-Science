package Java.My3_Loops;

public class L12_for_loop {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i+1);
//        }

//        for (int i = 1; i <= 7; i++) {
//            System.out.println(i + " Day");
//            for (int j = 1; j <= 24; j++) {
//                System.out.println(j + " hour");
//            }
//        }

//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Day " + i);
//            for (int j = 1; j <= 9; j++) {
//                System.out.println("    " + (j+8) + " - " + (j+9));
//            }
//        }

        // we can also declare the for loop by :-
        int i = 1;
        for (; i < 5;) { // yes, we need to put 2 ';' at first and ending of the statement
            System.out.println("Day " + i);
            i++;
        }
    }
}
