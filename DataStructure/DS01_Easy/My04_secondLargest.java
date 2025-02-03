import java.util.Arrays;

public class My04_secondLargest {

    // Brute Force
    static int bruteSecondLargest(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }

    // Optimal
    static int optimalSecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                secondMax = max;
                max = arr[i];
            } else if (secondMax < arr[i] && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        return secondMax;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(bruteSecondLargest(arr));
        System.out.println(optimalSecondLargest(arr));
    }
}
