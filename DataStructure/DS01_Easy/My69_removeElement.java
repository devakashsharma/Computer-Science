public class My69_removeElement {
    static int removeElement(int[] nums, int val) {
        int i = 0; 

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++; 
            }
        }

        return i;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int result = removeElement(nums, val);
        System.out.println(result);
    }
}
