package Data-Structure.DS101_Array;
import java.util.Scanner;

// Return the first Repeat Value, else -1
public class DS105_repeatingNumber {
    static int repeatNumber(int[] arr) {
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                    // break will stop 1 iteration
                    // return will stop the method
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = userInput.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = userInput.nextInt();
        }

        int repeatValue = repeatNumber(arr);
        System.out.println("Repeat Number: " + repeatValue);

    }
}
