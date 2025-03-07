import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class My59_closestPrime {
    static int[] closestPrimes(int left, int right) {
        boolean[] isPrime = sieveOfEratosthenes(right);
        List<Integer> primes = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        if (primes.size() < 2) {
            return new int[]{-1, -1};
        }

        int num1 = primes.get(0);
        int num2 = primes.get(1);
        int minDiff = num2 - num1;

        for (int i = 1; i < primes.size() - 1; i++) {
            int currentDiff = primes.get(i + 1) - primes.get(i);
            if (currentDiff < minDiff) {
                minDiff = currentDiff;
                num1 = primes.get(i);
                num2 = primes.get(i + 1);
            }
        }

        return new int[]{num1, num2};
    }

    static boolean[] sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        return isPrime;
    }

    public static void main(String[] args) {
        int left = 10;
        int right = 20;
        int[] result = closestPrimes(left, right);
        System.out.println(Arrays.toString(result));
    }
}
