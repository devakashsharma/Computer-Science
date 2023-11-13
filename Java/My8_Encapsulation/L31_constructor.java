package Java.My8_Encapsulation;

class Humans2 {
    private String name;
    private int age;

    // constructor is a special method, it has the same name as the class name, and also it doesn't return anything
    // everytime we create an object, constructor will be called
    public Humans2() { // default constructor
        name = "Akash";
        age = 21;
    }

    public Humans2(int a, String n) { // parameterized constructor: A constructor which takes a value
        name = n;
        age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class L31_constructor {
    public static void main(String[] args) {
        Humans2 obj = new Humans2();
        Humans2 obj2 = new Humans2(30, "Akash");
        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj2.getName() + " : " + obj2.getAge());

    }
}
