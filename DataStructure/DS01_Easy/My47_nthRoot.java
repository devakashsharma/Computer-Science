public class My47_nthRoot {

    // method to calculate root of a number
    static int root(int mid, int n, int m) {
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= mid;
            if (ans > m) {
                return 2;
            }
        }

        if (ans == m) {
            return 1;
        }

        return 0;
    }

    // method to calculate nth root of a number
    static int nthRoot(int n, int m) {
        int low = 1, high = m;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (root(mid, n, m) == 1) {
                return mid;
            } else if (root(mid, n, m) == 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int n = 2, m = 16;
        System.out.println(nthRoot(n, m));
        
        n = 3;
        m = 27;
        System.out.println(nthRoot(n, m));

        n = 2;
        m = 15;
        System.out.println(nthRoot(n,m));
    }
}
