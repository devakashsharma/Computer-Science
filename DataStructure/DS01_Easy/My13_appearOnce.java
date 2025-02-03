import java.util.HashMap;
import java.util.Map;

public class My13_appearOnce {
    
    // optimal
    static int appearOnce(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result ^= arr[i];
        }

        return result;
    }

    // using hashmap
    static int appearOnceUsingMap(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int value = map.getOrDefault(arr[i], 0);
            map.put(arr[i], value + 1);
        }

        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            if (it.getValue() == 1) {
                return it.getKey();
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        System.out.println(appearOnce(arr));
        System.out.println(appearOnceUsingMap(arr));
    }
}
