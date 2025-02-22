public class My43_timesRotate {
    static int timesRotated(int[] arr) {
        int low = 0, high = arr.length - 1;
        int min = Integer.MAX_VALUE;
        int index = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[low] <= arr[high]) {
                if (arr[low] <= min) {
                    index = low;
                    min = arr[low];
                }
                break;
            }

            if (arr[low] <= arr[mid]) {
                if (arr[low] <= min) {
                    index = low;
                    min = arr[low];
                }
                low = mid + 1;
            } else {
                if (arr[mid] <= min) {
                    index = mid;
                    min = arr[mid];
                }
                high = mid - 1;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 8, 9, 1, 2, 3, 4, 5, 6 };

        System.out.println(timesRotated(arr));
    }
}
