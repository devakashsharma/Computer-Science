package Java.My8_Encapsulation;

import java.util.Scanner;

class Humans
{
    private String name;
    private int age;

    // we can generate getter and setter just by using code editor or IDE, just right click then go to generate (Intellij) or Source Action (vs code) and select the variables
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

public class L29_getter_setter {
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        // We all have name, address, bank etc. and something we don't want to share to anyone, only limited person have access to know about it
        // like the instagram, we all have public or private account, in public we have given the access to all peoples, and in private it given to only limit person or the person we wanted to know
        // Encapsulation is give the function to give us the authority over our data access
        Humans obj = new Humans();

        System.out.print("Enter your name: ");
        String username = userInput.next();
        obj.setName(username);

        System.out.print("Enter your age: ");
        int userage = userInput.nextInt();
        obj.setAge(userage);
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
