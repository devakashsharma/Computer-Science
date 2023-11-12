package Java.My6_String;

public class L24_stringBuffer {
    public static void main(String[] args) {
        // String Buffers are mutable, by default it gives 16 byte storage, and add new values in a continuous memory
        StringBuffer name = new StringBuffer("Akash Sharma");
        // name.deleteCharAt(0);
        name.insert(0, "Java Developer ");
        name.setLength(30); // now the limit is 30
        System.out.println(name);
    }
}
