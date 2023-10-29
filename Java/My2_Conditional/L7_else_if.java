package Telsuko.My2_Conditional;

public class L7_else_if
{
    public static void main(String[] args)
    {
        int a = 5;
        int b = 11;
        int c = 7;

        if (a > b && a > c)
        {
            System.out.println(a);
        }
        else if (b > c)
        {
            System.out.println(b);
        }
        else
        {
            System.out.println(c);
        }
    }
}
