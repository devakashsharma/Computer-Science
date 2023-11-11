package Java.My4_methods;

public class L19_Jagged_array {
    public static void main(String[] args) {
        // jagged array
        int jaggedArray[][] = new int[3][]; // whose 2nd array size is not required to define

        jaggedArray[0] = new int[4];
        jaggedArray[1] = new int[2];
        jaggedArray[2] = new int[3];

        /*
         so heres the value will be store like
         [*, *, *, *] 4
         [*, *] 2
         [*, *, *] 3
        */

        // puting values
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = (int)(Math.random()*10);
            }
        }

        // print the array
        for (int element[]: jaggedArray) {
            for (int ele: element) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}