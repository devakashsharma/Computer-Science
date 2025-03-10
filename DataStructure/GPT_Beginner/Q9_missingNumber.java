public class Q9_missingNumber {
    static int missingNumber(int[] arr) {
        int n = arr.length;
        int total = (n + 1) * (n + 2) / 2;

        for (int i = 0; i < n; i++) {
            total -= arr[i];
        }

        return total;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
        int missing = missingNumber(arr);

        System.out.println(missing);
    }
}
