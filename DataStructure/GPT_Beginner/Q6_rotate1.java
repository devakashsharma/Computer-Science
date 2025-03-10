public class Q6_rotate1 {
    static int[] rotateByOnePlace(int[] arr) {
        int n = arr.length;

        int temp = arr[0];

        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[n - 1] = temp;

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] rotated = rotateByOnePlace(arr);

        for (int i = 0; i < rotated.length; i++) {
            System.out.print(rotated[i] + " ");
        }
    }
}
