package Java.My7_Static;

class Mobile 
{
    String brand;
    int price;
    String name;

    public void show() 
    {
        System.out.println(brand + " : " + price + " : " + name);
    }
}
public class L25_static 
{
    public static void main(String[] args) 
    {
        Mobile m1 = new Mobile();
        m1.brand = "Sumsung";
        m1.price = 1200;
        m1. name = "Galaxy";

        Mobile m2 = new Mobile();
        m2.brand = "Apple";
        m2.price = 1500;
        m2.name = "15 pro";

        m1.show();
        m2.show();
    }
}
