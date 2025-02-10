public class My28_palindrome {
    static boolean isPalindrome(String str) {
        int n = str.length();
        String rev = "";
        for (int i = n - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        if (str.equals(rev)) {
            return true;
        }

        return false;
    }

    // optimal
    static boolean optimalPalin (String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "madam";
        System.out.println(isPalindrome(str));
        System.out.println(optimalPalin(str));
    }
}
