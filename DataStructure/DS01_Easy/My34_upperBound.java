public class My34_upperBound {
    static int upperBound(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int upper = arr.length;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] > x) {
                upper = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return upper;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,3};
        int x = 2;
        int ind = upperBound(arr, x);
        System.out.println("The upper bound is the index: " + ind);
    }
}
