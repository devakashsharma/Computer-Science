// package Java_Practice.Array;
import java.util.Scanner;

public class My01_targetSum {
    static int targetSum(int[] arr, int target) {
        int arrSize = arr.length;
        int count = 0;

        for (int i = 0; i < arrSize; i++) {
            for (int j = i + 1; j< arrSize; j++) {
                if (arr[i] + arr[j] == target) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = userInput.nextInt();

        System.out.println("Enter target sum: ");
        int target = userInput.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array element: ");
        for (int i = 0; i < size; i++) {
            arr[i] = userInput.nextInt();
        }

        int total = targetSum(arr, target);
        System.out.println(total);
    }
}
