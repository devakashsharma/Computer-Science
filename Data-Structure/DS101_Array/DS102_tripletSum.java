package Data-Structure.DS101_Array;
import java.util.Scanner;

public class DS102_tripletSum {

    static int tripletSum(int[] arr, int target) {
        int size = arr.length;
        int count = 0;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                for (int k = j + 1; k < size; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = userInput.nextInt();

        System.out.println("Enter target: ");
        int target = userInput.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = userInput.nextInt();
        }

        int total = tripletSum(arr, target);
        System.out.println(total);

    }
}
