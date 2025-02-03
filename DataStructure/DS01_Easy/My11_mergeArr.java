public class My11_mergeArr {
    // print array
    static void printArray(int[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    static int[] mergeArr(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length + arr2.length];
        int i = 0;
        for (int j = 0; j < arr1.length; j++) {
            arr[i] = arr1[j];
            i++;
        }

        for (int j = 0; j < arr2.length; j++) {
            arr[i] = arr2[j];
            i++;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        int[] newArr = mergeArr(arr1, arr2);
        printArray(newArr);
    }
}
