import java.util.ArrayList;

public class My35_insertPosition {
    static void insertPosition(int[] arr, int x) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        int low = 0, high = list.size() - 1;
        int insert = list.size();

        while (low <= high) {
            int mid = (low + high) / 2;
            if (list.get(mid) >= x) {
                insert = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        list.add(insert, x);
        System.err.println(list);
    }

    static int optimal (int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int insert = arr.length;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= x) {
                insert = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return insert;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        int x = 7;
        insertPosition(arr, x);
        System.out.println("The insert position is the index: " + optimal(arr, x));
    }
}
