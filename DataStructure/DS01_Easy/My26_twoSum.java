public class My26_twoSum {
    static int[] twoSum(int[] arr, int target) {

        if (arr == null || arr.length < 2) {
            return new int[]{};
        }

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int currentSum = arr[left] + arr[right];
            if (currentSum == target) {
                return new int[]{left + 1, right + 1};
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }
        
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] numbers1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = twoSum(numbers1, target1);
        System.out.println(result1[0] + " " + result1[1]);
    }
}
