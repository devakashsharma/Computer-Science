public class My51_shipPackage {

    // method to calculate the days
    static int shipDays(int[] arr, int mid) {
        int day = 1;
        int load = 0;

        for (int i = 0; i < arr.length; i++) {
            if (load + arr[i] > mid) {
                day++;
                load = arr[i];
            } else {
                load += arr[i];
            }
        }

        return day;
    }

    // method to calculate the ship package
    static int shipPackage(int[] arr, int day) {
        int low = Integer.MIN_VALUE, high = 0;

        for (int i = 0; i < arr.length; i++) {
            high += arr[i];
            low = Math.max(low, arr[i]);
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (shipDays(arr, mid) > day) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] arr = { 5, 4, 5, 2, 3, 4, 5, 6 };
        int day = 5;
        System.out.println(shipPackage(arr, day));
    }
}
