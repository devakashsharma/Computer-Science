public class My08_count {

    static int count (int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 3, 3};
        System.out.println(count(arr, 3)); // 4
    }
}
