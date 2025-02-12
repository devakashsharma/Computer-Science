import java.util.HashMap;

public class My32_frequencyStr {
    static char findMostFrequentChar(String str) {
        if (str == null || str.isEmpty()) {
            return '\0';
        }

        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        char mostFrequentChar = '\0';
        int maxFrequency = 0;

        for (HashMap.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostFrequentChar = entry.getKey();
            }
        }

        return mostFrequentChar;
    }

    public static void main(String[] args) {
        String str = "hello world";
        char result = findMostFrequentChar(str);
        if (result != '\0') {
            System.out.println("The most frequent character is: " + result);
        } else {
            System.out.println("The string is empty.");
        }
    }
}
