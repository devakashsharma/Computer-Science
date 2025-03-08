public class My70_blackWhite {
    static int blackWhite(String blocks, int k) {
        int blackCount = 0, min = Integer.MAX_VALUE;

        for (int i = 0; i < blocks.length(); i++) {
            if (0 <= i - k && blocks.charAt(i - k) == 'B') blackCount--;
            if (blocks.charAt(i) == 'B') blackCount++;
            min = Math.min(min, k - blackCount);
        }

        return min;
    }
}