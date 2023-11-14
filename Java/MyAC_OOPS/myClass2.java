package Java.MyAC_OOPS;

class Student {
    String name;
    int age;

    public void printStudentInfo() {
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
        System.out.println();
    }

    // Non parameterized constructor
    Student() {
        System.out.println("Hello there, it is non parameterized constructor");
    }

    // parameterized constructor
    // reminder 'this' is showing the current object
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // copy constructor
    Student (Student stud) {
        this.name = stud.name;
        this.age = stud.age;
    }
}
public class myClass2 {
    public static void main(String[] args) {
        // here the Student() is a constructor
        // they help to build the class
        // they have 3 properties
        // 1. Class name and constructor name will be same
        // 2. they don't return anything
        // 3. for one object, constructor will call only once
        Student s1 = new Student();
        s1.name = "Ken";
        s1.age = 19;

        Student s2 = new Student();
        s2.name = "Saturo";
        s2.age = 29;

        Student s3 = new Student("Naruto", 17);

        Student s4 = new Student(s3);

        s1.printStudentInfo();
        s2.printStudentInfo();
        s3.printStudentInfo();
        s4.printStudentInfo();
    }
}
