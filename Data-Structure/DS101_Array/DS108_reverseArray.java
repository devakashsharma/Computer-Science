package Data-Structure.DS101_Array;
import java.util.Scanner;

public class DS108_reverseArray {
    static int[] reverseArr(int[] arr) {
        int size = arr.length;
        int j = 0;
        int[] revArr = new int[size];
        for (int i = (size - 1); i >= 0; i--) {
            revArr[j++] = arr[i];
        }

        return revArr;
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

        int[] revArr = reverseArr(arr);
        for (int i = 0; i < size; i ++) {
            System.out.print(revArr[i] + " ");
        }
    }    
}
