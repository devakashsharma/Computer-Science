import java.util.Scanner;

public class DS104_secondLargestNumber {
    static int findMax(int[] arr) {
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    static int findSecondMax(int[] arr) {
        int maxValue = findMax(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == maxValue) {
                arr[i] = Integer.MIN_VALUE;
            }
        }

        int secondMax = findMax(arr);

        return secondMax;
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = userInput.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = userInput.nextInt();
        }

        int secLarge = findSecondMax(arr);
        System.out.println("Second Largest Number: " + secLarge);

    }
}
