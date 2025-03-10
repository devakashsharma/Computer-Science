public class Q8_removeDuplicate {
    static int removeDuplicate(int[] arr) {
        int ind = 0;
        for (int i = 0; i < arr.length; i++) {
           if (arr[ind] != arr[i]) {
               arr[++ind] = arr[i];
           }
        }

        return ind + 1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
        int n = removeDuplicate(arr);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
