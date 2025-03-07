public class My61_commonPrefix {
    static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return ""; 
        }

        String reference = strs[0];

        for (int i = 0; i < reference.length(); i++) {
            char currentChar = reference.charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != currentChar) {
                    return reference.substring(0, i); 
                }
            }
        }

        return reference;
    }

    public static void main(String[] args) {
        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs1)); 

        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println(longestCommonPrefix(strs2));
    }
}
