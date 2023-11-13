package Java.My7_Static;

class Mobiles
{
    String brand;
    int price;
    static String name;

    // whenever we create the object,  inside first class load and then objects are instantiated
    // we have class loader in jvm, and when we run our program the class is load first and then it create objects
    // class only load once, so that is why static print only once and constructor 2 times
    static
    {
        name = "Phone";
        // static call only 1 times
        System.out.println("static");
    }
    public Mobiles()
    {
        brand = "";
        price = 200;
        // constructor will be call 2 times
        System.out.println("Constructor");
    }
}
public class L26_staticBlock 
{
    public static void main(String[] args) throws ClassNotFoundException
    {
        // Mobiles m1 = new Mobiles();
        // m1.brand = "Sumsung";
        // m1.price = 1200;
        // m1. name = "Galaxy";

        // Mobiles m2 = new Mobiles();
        
        // in order to call the class we have to create an object first then we call, right??
        // but in java we can call the class without creating any objects
        Class.forName("Mobiles");
        
    }
}
