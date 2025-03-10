public class My37_lastOccur {
    static int lastOccur(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int lastOccur = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                lastOccur = mid;
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return lastOccur;
    }

    public static void main(String[] args) {
        // int[] arr = {2, 4, 10, 10, 10, 18, 20};
        int[] arr = { 3, 4, 13, 13, 13, 20, 40 };
        int target = 20;
        int res = lastOccur(arr, target);
        System.out.println("The last occurrence of " + target + " is at index: " + res);
    }
}
