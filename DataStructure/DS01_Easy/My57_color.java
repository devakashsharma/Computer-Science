public class My57_color {
    static long coloredCells(int n) {
        if (n == 1) {
            return 1; // Edge case
        }
        
        return 2L * n * n - 2L * n + 1;
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println(coloredCells(n)); 
    }
}
