import java.util.Scanner;

public class DS116_multi2D {
    static void multi2D(int[][] arr1, int r1, int c1, int[][] arr2, int r2, int c2) {
        if (c1 != r2) {
            System.out.println("Multiplication not possible: wrong dimension");
            return;
        }

        int[][] multi = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    multi[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        for (int i = 0; i < multi.length; i++) {
            for (int j = 0; j < multi[i].length; j++) {
                System.out.print(multi[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // Input for matrix 1
        System.out.println("Enter the number of rows for matrix 1:");
        int r1 = userInput.nextInt();

        System.out.println("Enter the number of columns for matrix 1:");
        int c1 = userInput.nextInt();
        
        int[][] arr1 = new int[r1][c1];
        
        System.out.println("Enter matrix 1 values:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = userInput.nextInt();
            }
        }

        // Input for matrix 2
        System.out.println("Enter the number of rows for matrix 2:");
        int r2 = userInput.nextInt();
        
        System.out.println("Enter the number of columns for matrix 2:");
        int c2 = userInput.nextInt();
        
        int[][] arr2 = new int[r2][c2];
        System.out.println("Enter matrix 2 values:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j] = userInput.nextInt();
            }
        }

        multi2D(arr1, r1, c1, arr2, r2, c2);
    }
}

