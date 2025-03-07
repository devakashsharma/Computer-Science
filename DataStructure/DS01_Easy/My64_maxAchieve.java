public class My64_maxAchieve {
    static int theMaximumAchievableX(int num, int t) {
        return num + 2 * t;
    }

    public static void main(String[] args) {
        int num = 5;
        int t = 3;
        int result = theMaximumAchievableX(num, t);
        System.out.println(result);
    }
}
