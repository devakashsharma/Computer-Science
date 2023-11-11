package Java.My4_methods;

public class L18_multiArray {
    public static void main(String[] args) {
        // if we want to create an array of an array it means
        // i want to create a 'int' array, variable 'num' and it is array '[]' of '[]' which will be:
        int num[][] = new int[2][4]; // which num[](num of num) is array of [](of an array)
        num[0][0] = 2;
        num[0][1] = 42;
        num[0][2] = 24;
        num[0][3] = 12;
        num[1][0] = 23;        
        num[1][1] = 13;
        num[1][2] = 43;
        num[1][3] = 27;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(num[i][j]);
            }
        }
    }
}
