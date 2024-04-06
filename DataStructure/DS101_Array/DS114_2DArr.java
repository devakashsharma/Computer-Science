public class DS114_2DArr {

    // Methods to print the 2D arr
    static void printArr(int [][] arr) {
        for (int i = 0; i < arr.length; i++) {
            // System.out.print(arr[i] + " "); // it will print the reference value of the array
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // 2D arr
        int [][] arr = new int[2][];
        // in this the first is rows and second is column like matrics
        // rows are mandatory to assign value but column is optional
        int [][] newArr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        printArr(newArr);
    }
}