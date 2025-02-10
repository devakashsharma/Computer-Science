import java.util.ArrayList;

public class My29_countAlpha {
    static void countAlpha(String str) {
        ArrayList<String> vowel = new ArrayList<>();
        vowel.add("a");
        vowel.add("e");
        vowel.add("i");
        vowel.add("o");
        vowel.add("u");

        int vCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (vowel.contains(String.valueOf(str.charAt(i)))) {
                vCount++;
            }
        }

        System.out.println("Vowel count: " + vCount + " and Consonant count: " + (str.length() - vCount));
    }

    // optimal
    static void optimalCountAlpha(String str) {
        String vowels = "aeiou";
        int vCount = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (vowels.indexOf(str.charAt(i)) != -1) {
                vCount++;
            }
        }

        System.out.println("Vowel count: " + vCount + " and Consonant count: " + (str.length() - vCount));
    }

    public static void main(String[] args) {
        String str = "hello";
        countAlpha(str);
        optimalCountAlpha(str);
    }
}
