package Java.My3_Loops;

public class L10_while {
    public static void main(String[] args) {
//        int i = 1;
//        while(i < 5) {
//            System.out.println("Hello, Akash");
//            i++;
//        }

        int i = 1;
        while(i <= 5) {
            System.out.println("Hello, There " + i);
            int j = 1;
            while(j <= 3) {
                System.out.println("Hii " + j);
                j++;
            }
            i++;
        }

    }
}
