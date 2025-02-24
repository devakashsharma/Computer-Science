public class My46_sqrt {

    // brute force
    static int floorSqrt(int n) {
        int ans = 0;
        for (long i = 1; i <= n; i++) {
            long val = i * i;
            if (val <= (long) n) {
                ans = (int) i;
            } else {
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(floorSqrt(n));
    }
}
