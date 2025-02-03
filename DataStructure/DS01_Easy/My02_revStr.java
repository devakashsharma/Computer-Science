public class My02_revStr {
    static String revStr (String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        return rev;
    }

    public static void main(String[] args) {
        String str = "Akash";
        System.out.println(revStr(str));
    }
}
