public class My67_str {
    static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

    public static void main(String[] args) {
        String address = "1.1.1.1";
        String result = defangIPaddr(address);
        System.out.println(result);
    }
}
