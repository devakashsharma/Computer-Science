public class My44_singleSorted {
    static int singleSorted(int[] arr) {

        if (arr.length == 1) {
            return arr[0];
        }
        if (arr[0] != arr[1]) {
            return arr[0];
        }
        if (arr[arr.length - 1] != arr[arr.length - 2]) {
            return arr[arr.length - 1];
        }

        int low = 1, high = arr.length - 2;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid+1]) {
                return arr[mid];
            }

            if ((mid % 2 == 1 && arr[mid - 1] == arr[mid]) || (mid % 2 == 0 && arr[mid] == arr[mid + 1])) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6 };

        System.out.println(singleSorted(arr));
    }
}
