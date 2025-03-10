public class Q2_secondLargest {
    static int secondLargest(int[] arr) {
        int large = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                secondLargest = large;
                large = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != large) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(secondLargest(arr));
    }
}
