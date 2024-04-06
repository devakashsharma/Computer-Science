import java.util.Scanner;

public class DS109_rotateArray {

    static int[] rotateX(int[] arr, int k) {
        int size = arr.length;
        k = k % size;
        int[] rotArr = new int[size];
        int j = 0;

        for (int i = size - k; i < size; i++){
            rotArr[j++] = arr[i];
        }

        for (int i = 0; i < size - k; i++) {
            rotArr[j++] = arr[i];
        }
        return rotArr;
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
        int n = userInput.nextInt();

        int[] rotateArr = rotateX(arr, n);
        for (int i = 0; i < size; i ++) {
            System.out.print(rotateArr[i] + " ");
        }
    }
}
