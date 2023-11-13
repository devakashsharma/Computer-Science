package Java.My1_Basics;

public class L4_typeconversion {
    public static void main(String[] args) {

        // casting is explicit conversion
        // conversions is automatic casting

        float fnum = 3.5f;
        int num = (int)fnum;
        System.out.println(num);

        int inum = 340;
        byte bnum = (byte) inum; // it uses the '%' operator in order to make it into it's  range
        System.out.println(bnum);

        float fnum2 = 343.53f;
        byte bynum = (byte) fnum2;
        System.out.println(bynum);

        byte a = 20;
        byte b = 30;
        int result = a * b;
        // but a and b are byte so how could this be happened??
        // so in java if we perform any operations and that's exceed the range then it promotes their type and this is
        // also known as type promotion
        System.out.println(result);
    }
}
