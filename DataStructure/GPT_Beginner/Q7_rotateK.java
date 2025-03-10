public class Q7_rotateK {

    // swap
    static void swap(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static int[] rotateByKPlaces(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        // reverse first kth
        swap(arr, 0, n - k - 1);

        // reverse remaining
        swap(arr, n - k, n - 1);

        // reverse whole array
        swap(arr, 0, n - 1);
        
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 3;
        int[] rotated = rotateByKPlaces(arr, k);

        for (int i = 0; i < rotated.length; i++) {
            System.out.print(rotated[i] + " ");
        }
    }
}
