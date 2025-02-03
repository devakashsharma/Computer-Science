public class My12_moveZero {
    // print array
    static void printArray(int[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    // swap method
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Brute Force
    static int[] bruteMoveZero(int[] arr) {
        // int[] lastZero = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == 0) {
                    swap(arr, i, j);
                }
            }
        }

        return arr;
    }

    // optimal
    static int[] optimalMoveZero(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr; // Edge case: empty array or null input
        }

        int lastZero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[lastZero] = arr[i];
                lastZero++;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        
        int[] newArr = bruteMoveZero(arr);
        printArray(newArr);

        int[] newArrOp = optimalMoveZero(arr);
        printArray(newArrOp);
    }
}
