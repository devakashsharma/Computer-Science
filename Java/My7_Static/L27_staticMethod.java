package Java.My7_Static;

class Mobiles2
{
    String brand;
    int price;
    String name;

    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name);
    }

//    public static void staticShow()
    public static void staticShow(Mobiles2 obj)
    {
        System.out.println("Static Methods can be call without creating of any objects, it will be call through class name");
        System.out.println("one more thing and that is we cannot call the non static variable inside the static methods");
        System.out.println("the reason is simple\n" +
                "the name, price, brand are the instances variable means they are available to every one, obj1, obj2 etc\n" +
                "but the static methods is call directly through class, and how's the java would know which reference (instances variables) we are trying to call");
        System.out.println();
        System.out.println("But there is trick to call the non static variables inside the static methods");
        System.out.println(obj.brand + " : " + obj.price + " : " + obj.name);
    }
}
public class L27_staticMethod
{
    public static void main(String[] args)
    {
        // since the staring we are using static in our main file
        // if we remove the static then we need to create 'L27_staticMethod' object
        // but in java 'main' method is the root point, we cannot run the java file without main method, so there is deadlock 🙃🙃.

        Mobiles2 l26 = new Mobiles2();
        l26.brand = "Apple";
        l26.price = 300;
        l26.name = "phone";

        l26.show();

        // Mobiles2.staticShow();
        Mobiles2.staticShow(l26);

    }
}
