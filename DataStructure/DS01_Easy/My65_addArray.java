public class My65_addArray {
    static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] arr = new int[2 * n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = nums[i];
            arr[i + n] = nums[i];
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        int[] result = getConcatenation(nums);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
