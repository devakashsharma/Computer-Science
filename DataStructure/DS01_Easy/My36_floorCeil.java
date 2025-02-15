public class My36_floorCeil {
    // Method to find the floor of x
    static int findFloor(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int floor = -1; 

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                return arr[mid]; 
            } else if (arr[mid] < x) {
                floor = arr[mid]; 
                low = mid + 1; 
            } else {
                high = mid - 1; 
            }
        }

        return floor; 
    }

    // Method to find the ceil of x
    static int findCeil(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int ceil = -1; 

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                return arr[mid]; 
            } else if (arr[mid] > x) {
                ceil = arr[mid]; 
                high = mid - 1; 
            } else {
                low = mid + 1; 
            }
        }

        return ceil; 
    }

    // Method to find floor and ceil
    static int[] floorCeil(int[] arr, int x) {
        int[] res = new int[2];
        res[0] = findFloor(arr, x); // Floor
        res[1] = findCeil(arr, x);  // Ceil
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10};
        int x = 5;
        int[] res = floorCeil(arr, x);
        System.out.println("The floor is: " + res[0] + " and the ceil is: " + res[1]);
    }
}