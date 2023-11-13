package Java.My1_Basics;

public class L3_literals {
    public static void main(String[] args) {
        // literals
        int num = 0b101; // it is 5 in binary
        System.out.println(num);
        int num2 = 0x9E; // it is 158 in hexa decimal
        System.out.println(num2);
        int num3 = 100_00_00_000;
        System.out.println(num3);

        double fnum1 = 235e4; // epsilon number 
        System.out.println(fnum1);

        char c = 'a';
        c++;
        System.out.println(c);

    }
}
