package Java.My8_Encapsulation;

class Humans1
{
    private String name;
    private int age;

    // we can generate getter and setter just by using code editor or IDE, just right click then go to generate (Intellij) or Source Action (vs code) and select the variables
    public String getName() {
        return name;
    }

    // public void setName(String name, Humans1 obj) {
    // Humans1 obj1 = obj;
    // obj1.name = name;
    // }

    // this refers to the current objects
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

public class L30_thisKeyword {
    public static void main(String[] args) {
        Humans1 obj = new Humans1();
        obj.setName("Akash");
        obj.setAge(21);
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
