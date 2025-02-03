import java.util.HashSet;
import java.util.Set;

public class My18_subarr {
    // Given an array, check if there exists a subarray with sum equal to zero.

    // brute force approach
    static boolean subarrayExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i + 1; j < arr.length; j++) {
                sum += arr[j];
                if (sum == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    // optimal
    static boolean subarrayExist2(int[] arr) {
        Set<Integer> prefixSums = new HashSet<>();
        int prefixSum = 0;
        for (int num : arr) {
            prefixSum += num;
            if (prefixSum == 0 || prefixSums.contains(prefixSum)) {
                return true;
            }
            prefixSums.add(prefixSum);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, -3, 1, 6 };
        int[] arr2 = { 4, 2, 0, 1, 6 };
        int[] arr3 = { -3, 2, 3, 1, 6 };

        System.out.println("Brute Force");

        System.out.println(subarrayExist(arr)); // Output: true
        System.out.println(subarrayExist(arr2)); // Output: true
        System.out.println(subarrayExist(arr3)); // Output: false

        System.out.println("Optimal");

        System.out.println(subarrayExist2(arr));
        System.out.println(subarrayExist2(arr2));
        System.out.println(subarrayExist2(arr3));
    }
}
