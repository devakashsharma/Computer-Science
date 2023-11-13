package Java.My7_Static;

class Mobile
{
    String brand;
    int price;
    // String name;

    // if we change Simple string to static then this string 'name' will be common to all
    // it means if we change the value of 1 object then all the 'name' value will be change
    // static variable is shared by all the variable
    // static variable is call with class name not will the objects name
    static String name;

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
        
        // m1.name = "Smart Phone";
        Mobile.name = "Smart Phone";
        // static variables have separate memory in JVM
        // in static we are making class member not the object member  

        m1.show();
        m2.show();
    }
}
