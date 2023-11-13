package Java.My1_Basics;

public class L5_operators {
    public static void main(String[] args) {
        // Arithmetic operators
        int num1 = 5;
        num1 += 2;
        num1 *= 2;
//        num1++; // post increment
//        ++num1; // pre increment
        int num2 = 7;
        int result = num1 + num2;
        System.out.println(result);

        int result2 = ++num1; // it will first increment then fetch the value
        int result3 = num2++; // so this is first fetch the value then increment
        System.out.println("The value of result 2 is: " + result2);
        System.out.println("The value of result 3 is: " + result3);

        // relational operators
        int booNum1 = 5;
        int booNum2 = 7;
//        boolean isTrue = booNum1 < booNum2;
//        boolean isTrue = booNum1 <= booNum2;
//        boolean isTrue = booNum1 >= booNum2;l
//        boolean isTrue = booNum1 <= booNum2;
//        boolean isTrue = booNum1 == booNum2;
        boolean isTrue = booNum1 != booNum2;
        System.out.println(isTrue);

        // Logical operator
        int x = 5;
        int y = 9;
        int a = 4;
        int b = 6;

        boolean check = (x < y) && (a < b);
        System.out.println(check);
        check = (x < y) || (a > b);
        System.out.println(check);
        System.out.println(!check);

    }
}
