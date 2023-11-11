package Java.My5_Array;

class Students{
    int rollNo;
    String name;
    int marks;
}
public class L21_enhancedLoop {
    public static void main(String[] args) {
        int num[] = new int[3];
        num[0] = 4;
        num[1] = 5;
        num[2] = 2;

        // for each loop
        for (int element : num) {
            System.out.println(element);
        }

        Students s1 = new Students();
        s1.rollNo = 1;
        s1.name = "Light";
        s1.marks = 99;

        Students s2 = new Students();
        s2.rollNo = 2;
        s2.name = "Naruto";
        s2.marks = 49;

        Students s3 = new Students();
        s3.rollNo = 3;
        s3.name = "Johan";
        s3.marks = 99;

        Students students[] = new Students[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (Students std : students) {
            System.out.println(std.rollNo + ". " + std.name + " : " + std.marks);
        }
    }
}
