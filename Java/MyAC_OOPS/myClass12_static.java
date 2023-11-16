package Java.MyAC_OOPS;

class Student {
    String name;
    static String school; // school name will common for all students, right? so we will make it a static variable

    public static void changeSchoolName(){
        school = "newKV";
    }
}
public class myClass12_static {
    public static void main(String[] args) {
        Student.school = "KV"; // we can access a static variable directly through class name, we don't need to create an object first then use the variable, static are common for all class
        Student std1 = new Student();
        std1.name = "Tony";
        System.out.println(Student.school);
    }
}
