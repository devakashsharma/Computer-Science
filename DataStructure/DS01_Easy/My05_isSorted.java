public class My05_isSorted {
    static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(isSorted(arr)); // true

        int[] arr2 = {1, 2, 3, 5, 4};
        System.out.println(isSorted(arr2)); // false
    }
}
