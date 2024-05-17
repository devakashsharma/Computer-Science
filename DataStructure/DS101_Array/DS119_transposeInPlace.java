public class DS119_transposeInPlace {
    static void transposeInPlace(int [][] arr, int row, int col) {
        for(int i = 0; i < col; i++) {
            for(int j = 1; j< row; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }

        }
        for(int i = 0; i< arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        transposeInPlace(arr, 3, 3);
    }
}
