import java.util.ArrayList;
import java.util.Arrays;

public class My25_mergeSort {

    // merge
    static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> arrList = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                arrList.add(arr[left]);
                left++;
            } else {
                arrList.add(arr[right]);
                right++;
            }
        }

        // if left elements still left
        while (left <= mid) {
            arrList.add(arr[left]);
            left++;
        }

        // if right elements still left
        while (right <= high) {
            arrList.add(arr[right]);
            right++;
        }

        // transfer the sorted list to an array
        for (int i = low; i <= high; i++) {
            arr[i] = arrList.get(i - low);
        }
    }

    static void mergeSort(int[] arr, int low, int high) {
        if (low >= high)
            return;

        int mid = (low + high) / 2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void main(String[] args) {
        int[] arr = { 38, 27, 43, 3, 9, 82, 10 };
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
