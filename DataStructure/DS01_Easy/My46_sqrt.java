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

    // Optimal
    static int optimalFloorSqrt(int n) {
        int low = 1, high = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long val = (long) mid * mid;
            if (val <= n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return high;
    }

    public static void main(String[] args) {
        int n = 10;
        // System.out.println(floorSqrt(n));
        System.out.println(optimalFloorSqrt(n));
    }
}
