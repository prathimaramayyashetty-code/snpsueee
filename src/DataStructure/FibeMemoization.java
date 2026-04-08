package DataStructure;

import java.util.Arrays;

public class FibeMemoization {
    static int fib(int n, int[] dp) {
        if (n <= 1) return n;

        if (dp[n] != -1)  // already calculated
            return dp[n];

        dp[n] = fib(n - 1, dp) + fib(n - 2, dp);
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 10;

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        System.out.println("Fibonacci of " + n + " is: " + fib(n, dp));
    }
}
