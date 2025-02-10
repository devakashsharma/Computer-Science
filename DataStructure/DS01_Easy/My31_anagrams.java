import java.util.HashMap;

public class My31_anagrams {
    static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] count = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }

        for (int i = 0; i < 256; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }

    static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if lengths are the same
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create a frequency map for str1
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : str1.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Compare with str2
        for (char c : str2.toCharArray()) {
            if (!frequencyMap.containsKey(c)) {
                return false; // Character not in str1
            }
            frequencyMap.put(c, frequencyMap.get(c) - 1);
            if (frequencyMap.get(c) == 0) {
                frequencyMap.remove(c);
            }
        }

        // If the map is empty, the strings are anagrams
        return frequencyMap.isEmpty();
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(isAnagram(str1, str2));
        System.out.println(areAnagrams(str1, str2));
    }
}
