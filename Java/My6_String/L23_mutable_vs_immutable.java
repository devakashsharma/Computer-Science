package Java.My6_String;

public class L23_mutable_vs_immutable {
    public static void main(String[] args) {
        String name = "Akash";
        name = name + " Sharma";
        System.out.println("Hello " + name);

        // in java if we create 2 string objects with same value then only 1 object will create, for ex:
        String s1 = "Same";
        String s2 = "Same";
        System.out.println(s1 == s2);

        // the 'same' will create in a heap memory (only one) but the same reference will be given to s1 and s2
        // so inside JVM heap memory we have String Constant Pool which will check the value, if the value is repeating or not
        
        // and in line 6 we add ' Sharma', at there, in the heap memory a new memory will allocate as 'Akash Sharma" and the old value will delete after sometime
        // the reference of new value will be assign to variable 'name'.
    }
}
