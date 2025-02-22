public class My39_countOccur {

    static int countOccurance(int[] arr, int target) {
        int first = findFirstOccurrence(arr, target);
        int last = findLastOccurrence(arr, target);

        if (first == -1) {
            return 0; // Target not found
        } else {
            return last - first + 1;
        }
    }

    static int findFirstOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                result = mid;
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    static int findLastOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                result = mid;
                low = mid + 1; // Search right for last occurrence
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 5, 5, 6, 6, 8, 9};
        int target = 5;
        int count = countOccurance(arr, target);
        System.out.println("Occurrences of " + target + ": " + count); // Output: 3

        int[] arr2 = {1,2,3,4,5};
        target = 6;
        count = countOccurance(arr2, target);
        System.out.println("Occurrences of " + target + ": " + count); //output 0

        int[] arr3 = {1,2,3,3,3,3,4,5};
        target = 3;
        count = countOccurance(arr3, target);
        System.out.println("Occurrences of " + target + ": " + count); //output 4
    }
}