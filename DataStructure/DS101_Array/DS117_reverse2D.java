public class DS117_reverse2D {
    static void reverseArray(int[][] arr, int row, int col) {
        int[][] newArr = new int[row][col];

        for (int i = 0; i < row; i++) {
            int k = 0;
            for (int j = (col - 1); j >= 0; j--) {
                newArr[i][k++] = arr[i][j];
            }
        }

        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[i].length; j++) {
                System.out.print(newArr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = { {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        reverseArray(arr, 3, 3);
    }
}