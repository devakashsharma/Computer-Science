import java.util.Scanner;

public class DS110_rotateInPlace {
    static void reverseArray(int[] arr, int i, int j) {
        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static void rotateNoSpace(int[] arr, int k) {
        int size = arr.length;
        k = k % size;

//        reverseArray(arr, 0, size-k-1);
//        reverseArray(arr, size-k, size-1);
//        reverseArray(arr, 0, size+1);

        reverseArray(arr, 0, arr.length - 1);
        reverseArray(arr, 0, k - 1);
        reverseArray(arr, k, arr.length - 1);

    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = userInput.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter array element: ");
        for (int i = 0; i < size; i++) {
            arr[i] = userInput.nextInt();
        }

        System.out.print("Enter the number of move: ");
        int k = userInput.nextInt();

        rotateNoSpace(arr, k);
        for (int i = 0; i < size; i ++) {
            System.out.print(arr[i] + " ");
        }
    }
}
