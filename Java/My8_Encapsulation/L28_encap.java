package Java.My8_Encapsulation;
import java.util.Scanner;

class Human
{
    // in order to make in private we will use private access modifier
//    String name;
//    int age;

//    private String name = "Akash";
//    private int age = 21;

    private String name;
    private int age;
    
// for getting the value we have get and for setting we will use set
    public void setName(String n)
    {
        name = n;
    }
    public void setAge(int a)
    {
        age = a;
    }

    // now this will be only accessible with Human class, not the other class including L28_encap class
    // we will make some options to make available to someone
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
}
public class L28_encap
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        // We all have name, address, bank etc. and something we don't want to share to anyone, only limited person have access to know about it
        // like the instagram, we all have public or private account, in public we have given the access to all peoples, and in private it given to only limit person or the person we wanted to know
        // Encapsulation is give the function to give us the authority over our data access
        Human obj = new Human();
//        obj.name = "Akash";
//        obj.age = 21;
//        System.out.println(obj.name); // anyone can fetch the data without our permission
        System.out.print("Enter your name: ");
        String username = userInput.next();
        obj.setName(username);

        System.out.print("Enter your age: ");
        int userage = userInput.nextInt();
        obj.setAge(userage);
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
