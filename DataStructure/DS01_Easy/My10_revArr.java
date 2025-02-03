public class My10_revArr {
    static int[] revArr(int[] arr) {
        int[] newRev = new int[arr.length];

        int first = 0;
        int last = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            newRev[first] = arr[last];
            first++;
            last--;
        }

        return newRev;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] newArr = revArr(arr);

        System.out.print("[ ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println("]");
    }
}
