
import java.util.Stack;
public class stack {

    public static void main(String[] args) {

        // stack is a lifo data structure, it stores objects into a sort of "vertical tower"

        // use of stack
        // 1. undo/redo features in text editors
        // 2. moving forward/backward through browser history
        // 3. backtracting algorithims (maze, file directories)
        // 4. calling functions (call back)


        Stack<String> stk = new Stack<String>();

        System.out.println(stk.empty()); // is stack empty - true

        stk.push("Johan");
        stk.push("Eren");
        stk.push("Friend");
        stk.push("Ayonokyoji");
        stk.push("Light");

        System.out.println(stk.empty()); // isEmpty - false
        System.out.println(stk); // value - [Johan, Eren, Friend, Ayonokyoji, Light]

        // copying a stack
        @SuppressWarnings("unchecked") // just ignore it
        Stack<String> newStk = (Stack<String>) stk.clone();

        // in order to remove the element we will be use pop()
        stk.pop(); // we don't have to pass any element, as it will remove the last element
        String myFavChar = stk.pop();

        System.out.println(stk); // value - [Johan, Eren]
        System.out.println(myFavChar); // value - Ayonokyoji

        // .peek() is just peeking the last value in a stack, it do nothing just peeking
        System.out.println(newStk.peek());

        // if we want to know the index of the values then .search()
        // one more thing, in stack the indexing starting from the last element as that element will be the first to access cause stack is Last in First out (LIFO)
        System.out.println(newStk.search("Light")); // 1
        System.out.println(newStk.search(("Eren"))); // 4

        // if values doesn't exist then it simply return -1

    }
}