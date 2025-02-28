import java.util.Arrays;

public class My53_aggCows {

    // methods to find the distance between the cows
    static boolean canWePlace(int[] arr, int dist, int cows) {
        int count = 1;
        int last = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - last >= dist) {
                count++;
                last = arr[i];
            }

            if (count >= cows) {
                return true;
            }
        }

        return false;
    } 

    // method to find the aggresive cows
    static int aggCows(int[] arr, int cows) {
        Arrays.sort(arr);

        int low = 0, high = arr[arr.length - 1] - arr[0];

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canWePlace(arr, mid, cows)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return high;
    }

    public static void main(String[] args) {
        // int[] arr = {1, 2, 4, 8, 9};
        int[] arr = {0, 3, 4, 7, 10, 9};
        int cows = 4;
        System.out.println(aggCows(arr, cows));
    }
}
