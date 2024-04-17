import java.util.Scanner;

public class DS115_sum2D {
    static void sumOf2DArray(int [][] arr1, int r1, int c1, int [][] arr2, int r2, int c2) {
        if (r1 != r2 || c1 != c2) {
            System.out.println("Something went wrong");
            return;
        }

        int[][] sum = new int[r1][c1];

        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c1; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        // printing the matrix
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter rows and columns for matrix 1");
        int r1 = userInput.nextInt();
        int c1 = userInput.nextInt();

        int arr1[][] = new int[r1][c1];

        System.out.println("Enter matrix values");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = userInput.nextInt();
            }
        }

        System.out.println("Enter rows and columns for matrix 2");
        int r2 = userInput.nextInt();
        int c2 = userInput.nextInt();

        int arr2[][] = new int[r2][c2];

        System.out.println("Enter matrix values");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j] = userInput.nextInt();
            }
        }

        sumOf2DArray(arr1, r1, c1, arr2, r2, c2);


    }
}