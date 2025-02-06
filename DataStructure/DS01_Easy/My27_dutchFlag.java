public class My27_dutchFlag {

    // print array
    static void printArray(int[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    // swap
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // dutch flag
    static void dutchFlag(int[] arr) {
        int n = arr.length;
        int low = 0, mid = 0, high = n - 1;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    swap(arr, low, mid);
                    low++;
                    mid++;
                    break;

                case 1:
                    mid++;
                    break;

                case 2:
                    swap(arr, mid, high);
                    high--;
                    break;
            }
        }

        printArray(arr);
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 0, 1, 2, 0, 1, 2 };
        dutchFlag(arr);
    }
}
