package Telsuko.My4_methods;

class calculator {
    public int add(int n1, int n2) {
        int result = n1 + n2;
        return result;
    }
}
public class L13_objects_classes {
    public static void main(String[] args) {
        // In java everything is objects
        // Java is Object oriented programming
        // object have properties (which is know) and behaviour (which does according the properties it have)
        // In human - if I know something, it is a properties and if I do according to that something I know is behaviour
        // Example - I know Coding (properties) and I do coding (behaviour)

        // how to use a class?
        // to use a class we need to create/declare the object first:-
        // class_name reference_variable_name = memory_allocator to_whom();
        // it's like you are making data_type for the objects and that is non-primitive data type
        calculator cal = new calculator();

        int num1 = 5;
        int num2 = 9;
        int result = cal.add(num1, num2);
        System.out.println(result);
    }
}
