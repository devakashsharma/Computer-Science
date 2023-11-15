package Java.MyAC_OOPS;

class Student1 {
    String name;
    int age;

    // Polymorphism - It means "Poly - many, Morphism - forms = Many Forms", and it occurs when we have many classes that are related to each other
    // Classes have same features but can have different names
    // Polymorphism are 2 types - Method Overloading, Methods Overriding

    // Methods overloading - Compile Time Polymorphism
    public void printStudentInfo(String name) {
        System.out.println(name);
    }
    public void printStudentInfo(int age) {
        System.out.println(age);
    }
    public void printStudentInfo(String name, int age) {
        System.out.println("Name : " + name +
                "\nAge : " + age);
    }

}
public class myClass3 {
    public static void main(String[] args) {
        Student1 std1 = new Student1();
        std1.name = "Ezra";
        std1.age = 18;

        std1.printStudentInfo(std1.name, std1.age);
    }
}
