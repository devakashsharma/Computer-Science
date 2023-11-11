package Java.My5_Array;

class Student{
    int rollNo;
    String name;
    int marks;
}
public class L20_arrayObject {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNo = 1;
        s1.name = "Akash";
        s1.marks = 99;

        Student s2 = new Student();
        s2.rollNo = 1;
        s2.name = "Akash";
        s2.marks = 99;

        Student s3 = new Student();
        s3.rollNo = 1;
        s3.name = "Akash";
        s3.marks = 99;

        // Creating an array object
        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].rollNo + ". " + students[i].name + " : " + students[i].marks);
        }

    }
}
