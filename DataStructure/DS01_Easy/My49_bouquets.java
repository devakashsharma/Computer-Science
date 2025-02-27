public class My49_bouquets {

    // method to find max element in an array
    static int findMax(int[] arr) {
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            maxi = Math.max(maxi, arr[i]);
        }

        return maxi;
    }

    // method to find min element in an array
    static int findMin(int[] arr) {
        int mini = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            mini = Math.min(mini, arr[i]);
        }

        return mini;
    }

    // method to calculate bouquets
    static boolean bouquets(int[] arr, int mid, int m, int k) {
        int count = 0, noOfBouquets = 0;

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] <= mid) {
                count++;
            } else {
                noOfBouquets += count / k;
                count = 0;
            }
        }

        noOfBouquets += count / k;
        return noOfBouquets >= m;
    }

    // method to find the minimum number of days to make m bouquets
    static int minDays(int[] arr, int k, int m) {
        if (m * k > arr.length) {
            return -1;
        }

        int low = findMin(arr), high = findMax(arr);

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (bouquets(arr, mid, m, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        // int[] arr = {1, 10, 3, 10, 2};
        int[] arr = {7, 7, 7, 7, 13, 11, 12, 7};
        int k = 3, m = 2;
        System.out.println(minDays(arr, k, m));
    }
}
