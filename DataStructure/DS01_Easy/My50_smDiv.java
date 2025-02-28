public class My50_smDiv {

    // method to find max element in an array
    static int findMax(int[] arr) {
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            maxi = Math.max(maxi, arr[i]);
        }

        return maxi;
    }

    // method to find the smallest divisor number
    static int smDivNum(int[] arr, int mid) {
        int num = 0;

        for (int i = 0; i < arr.length; i++) {
            num += Math.ceil((double) arr[i] / (double) mid);
        }

        return num;
    }

    // method to find the smallest divisor
    static int smallestDivisor(int[] arr, int limit) {
        int low = 0, high = findMax(arr);

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (smDivNum(arr, mid) > limit) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        // int[] arr = { 1, 2, 5, 9 };
        int[] arr = { 8, 4, 2, 3 };
        int limit = 10;
        System.out.println(smallestDivisor(arr, limit));
    }
}
