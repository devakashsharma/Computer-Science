public class My21_firstLast {

    // print array
    static void printArray(int[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    // first occurrence
    static int firstOccur(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
    
    // last occurrence
    static int lastOccur(int[] arr, int target) {
        int num = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                num = i;
            }
        }

        return num;
    }


    static int[] firstLastOccur(int[] arr, int target) {
        int[] result = new int[2];
        result[0] = firstOccur(arr, target);
        result[1] = lastOccur(arr, target);
        return result;
    } 

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int target = 5;
        
        int[] result = firstLastOccur(arr, target);
        System.out.println("First Occurrence: " + result[0]);
        System.out.println("Last Occurrence: " + result[1]);
    }
}
