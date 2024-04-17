public class DS118_transpose2D {
    static void transpose(int[][] arr, int  rows, int cols) {
        int[][] arr1 = new int[cols][rows];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                arr1[i][j] = arr[j][i];
            }
        }

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5, 6},
//        };
        transpose(arr, 3, 3);
    }
}
