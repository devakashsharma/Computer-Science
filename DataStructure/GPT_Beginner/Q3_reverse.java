public class Q3_reverse {
    static int[] reverse(int[] arr) {
        int[] reversed = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            reversed[arr.length - i - 1] = arr[i];
        }

        return reversed;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] reversed = reverse(arr);

        for (int i = 0; i < reversed.length; i++) {
            System.out.print(reversed[i] + " ");
        }
    }
}
