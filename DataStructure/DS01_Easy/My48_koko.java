public class My48_koko {

    // method to find max element in an array
    static int findMax(int[] arr) {
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            maxi = Math.max(maxi, arr[i]);
        }

        return maxi;
    }

    // method to calculate eating hour
    static int kokoEatingHour(int[] arr, int mid) {
        int hour = 0;

        for (int i = 0; i < arr.length; i++) {
            hour += Math.ceil(arr[i] / mid);
        }

        return hour;
    }

    // methods to find the koko eating hour
    static int koko (int[] arr, int hour) {
        int low = 1, high = findMax(arr);

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int eatingHour = kokoEatingHour(arr, mid);

             if (eatingHour < hour) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 7, 11};
        int hour = 8;
        System.out.println(koko(arr, hour));
    }
}
