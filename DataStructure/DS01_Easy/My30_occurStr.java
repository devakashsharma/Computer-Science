import java.util.HashMap;

public class My30_occurStr {
    static char firstOccurFreq(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : str.toCharArray()) {
            if (map.get(c) == 1) {
                return c;
            }
        }

        return '\0';
    }

    public static void main(String[] args) {
        String str = "hello";
        System.out.println(firstOccurFreq(str));
    }
}
