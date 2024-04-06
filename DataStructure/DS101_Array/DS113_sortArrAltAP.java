import java.util.Scanner;

// sort arr, with 0s and 1s. (alternate approach)
public class DS113_sortArrAltAP {
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void sortArr(int[] arr) {
        int size = arr.length;
        int left = 0, right = size - 1;

        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swap(arr, left, right);
            }
            if (arr[left] == 0) {
                left++;
            }
            if (arr[right] == 1) {
                right--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int size = userInput.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter Element: ");
        for (int i = 0; i < size; i++) {
            arr[i] = userInput.nextInt();
        }

        System.out.print("Original Array: ");
        for (int i = 0; i< size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        System.out.print("Array after sorted: ");
        sortArr(arr);
        for (int i = 0; i< size; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
