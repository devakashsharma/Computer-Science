public class My56_isSumThree {
    static boolean isSumThree(int n) {
        while (n > 0) {
            int reminder = n % 3;
            if (reminder == 2)
                return false;
            n /= 3;
        }

        return true;
    }

    public static void main(String[] args) {
        int n = 27;
        System.out.println(isSumThree(n));
    }
}
