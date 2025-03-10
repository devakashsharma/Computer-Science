public class Q5_moveZeros {
    static int[] moveZeros(int[] arr) {
        int n = arr.length;
        int ind = -1;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                ind = i;
                break;
            }
        }

        if (ind == -1) {
            return arr;
        }

        for (int i = ind + 1; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[ind];
                arr[ind] = temp;
                ind++;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 0, 4, 5, 0 };
        int[] move = moveZeros(arr);

        for (int i = 0; i < move.length; i++) {
            System.out.print(move[i] + " ");
        }
    }
}
