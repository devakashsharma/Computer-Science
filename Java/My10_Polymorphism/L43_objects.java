package Java.My10_Polymorphism;
import java.util.Objects;

class Laptop {
    String model;
    int price;
    public String toString() {
        // return "Hello";
        return model + " : " + price;
    }
    public boolean equals(Laptop Laptop2) {
        // if (this.model.equals(Laptop2.model) && this.price == Laptop2.price)
        //    return true;
        // else
        //    return false;

        return this.model.equals(Laptop2.model) && this.price == Laptop2.price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return price == laptop.price && Objects.equals(model, laptop.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price);
    }
}
public class L43_objects {
    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        obj1.model = "Dell";
        obj1.price = 1000;

        Laptop obj2 = new Laptop();
        obj2.model = "Dell";
        obj2.price = 1000;

        // boolean result = obj1 == obj2;
        boolean result = obj1.equals(obj2);

        // System.out.println(obj);
        // everytime we call obj then it is actually calling obj.toString method and printing 'Laptop@7b23ec81'
        // System.out.println(obj.toString());
        // System.out.println(obj1);

        System.out.println(result);
    }
