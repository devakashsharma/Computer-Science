public class My33_lowerBound {
    static int lowerBound(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int lower = arr.length;

        while(low <= high) {
            int mid = (low + high) / 2;
            
            if (arr[mid] >= x) {
                lower =  mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return lower;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 15, 19};
        int x = 9;
        int ind = lowerBound(arr, x);
        System.out.println("The lower bound is the index: " + ind);
    }
}
