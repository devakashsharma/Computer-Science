public class My17_equilibrium {
    static int equilibrium(int[] arr) {
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] =  prefix[i - 1] + arr[i];
        }

        int totalSum = prefix[arr.length - 1];

        for (int i = 0; i < arr.length; i++) {
            int leftSum = (i == 0) ? 0 : prefix[i - 1];
            int rightSum = totalSum - prefix[i];

            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }    

    public static void main(String[] args) {
        int[] arr = { 2, 2, 2, 2 };
        System.out.println(equilibrium(arr)); // Output: -1 (No equilibrium index)

        int[] arr2 = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println(equilibrium(arr2)); // Output: 3

        int[] arr3 = {1, 7, 3, 6, 5, 6};
        System.out.println(equilibrium(arr3)); // Output: 3
    }
}
