public class My54_arrOperation {
    // Move zeros to the end
    void moveZeros(int[] a) {
        int n = a.length;
        int j = -1;
        
        // Find the first zero
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }

        // If no zero is found, return
        if (j == -1) return;

        // Swap non-zero elements with the first zero
        for (int i = j + 1; i < n; i++) {
            if (a[i] != 0) {
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                j++;
            }
        }
    }

    // Apply operations
    public int[] applyOperations(int[] nums) {
        int n = nums.length;

        // Perform n - 1 operations
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }

        // Move zeros to the end
        moveZeros(nums);

        return nums;
    }

    public static void main(String[] args) {
        My54_arrOperation obj = new My54_arrOperation();
        int[] nums = {2, 2, 0, 4, 0, 8};
        int[] res = obj.applyOperations(nums);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

}
