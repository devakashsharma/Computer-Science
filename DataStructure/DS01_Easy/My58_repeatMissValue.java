import java.util.Arrays;

public class My58_repeatMissValue {
    static int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] frequency = new int[n * n + 1]; 

        for (int[] row : grid) {
            for (int num : row) {
                frequency[num]++;
            }
        }

        int a = -1; 
        int b = -1;

        for (int i = 1; i <= n * n; i++) {
            if (frequency[i] == 2) {
                a = i; 
            } else if (frequency[i] == 0) {
                b = i; 
            }
        }

        return new int[]{a, b};
    }

    public static void main(String[] args) {
        int[][] grid = {{1, 3}, {2, 2}};
        int[] result = findMissingAndRepeatedValues(grid);
        System.out.println(Arrays.toString(result)); 
    }
}
