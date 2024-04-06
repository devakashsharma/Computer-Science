import java.util.Scanner;

public class DS111_frequency {
    static int[] makeFrequencyArray(int[] arr) {
        int[] freq = new int[10010];

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        return freq;
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

        int[] freq = makeFrequencyArray(arr);

        System.out.print("Enter Number of Queries: ");
        int queries = userInput.nextInt();

        while(queries > 0) {
            System.out.print("Enter number to search: ");
            int x = userInput.nextInt();
            if (freq[x] > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

            queries--;
        }
    }
}
