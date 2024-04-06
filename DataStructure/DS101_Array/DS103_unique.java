
import java.util.Scanner;

public class DS103_unique {
    static int unique(int[] arr) {
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }

        int unique = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] != -1) {
                unique = arr[i];
            }
        }

        return unique;
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

        int unique = unique(arr);
        System.out.println(unique);
    }
}
