package Telsuko.My4_methods;

class Car {
    int price = 100;

    public int model(int n1, int n2) {
        return n1 + n2;
    }
}
public class L16_stack_heap {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        car1.price = 500;
        System.out.println(car1.price);
        System.out.println(car2.price);

        // ones place is different from the other memory place
        // that is why the value doesn't change to the others one
    }
}
