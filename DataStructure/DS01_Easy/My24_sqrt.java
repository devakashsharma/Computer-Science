public class My24_sqrt {
    static int squareRoot(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int low = 0;
        int high = x;
        int result = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (mid <= x / mid) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int x = 25;
        System.out.println("Square root of " + x + " is: " + squareRoot(x)); // Output: 5

        x = 8;
        System.out.println("Square root of " + x + " is: " + squareRoot(x)); // Output: 2

        x = 1;
        System.out.println("Square root of " + x + " is: " + squareRoot(x)); // Output: 1
    }
}
