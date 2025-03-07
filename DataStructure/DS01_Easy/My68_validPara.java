import java.util.Stack;

public class My68_validPara {
    static boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                if (c == ')' && top != '(' || 
                    c == '}' && top != '{' ||
                    c == ']' && top != '[' ) {
                        return false;
                    }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        boolean result = isValid(s);
        System.out.println(result);
    }
}
