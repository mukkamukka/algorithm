package 분류별.dp;

/* https://www.acmicpc.net/problem/1463 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1463 {
    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        dp = new Integer[n + 1];
        dp[0] = dp[1] = 0;
        System.out.print(makeOne(n));
    }

    public static int makeOne(int n) {
        if (dp[n] == null) {
            if (n % 6 == 0) {
                dp[n] = Math.min(makeOne(n - 1), Math.min(makeOne(n / 3), makeOne(n / 2))) + 1;
            } else if (n % 3 == 0) {
                dp[n] = Math.min(makeOne(n / 3), makeOne(n - 1)) + 1;
            } else if (n % 2 == 0) {
                dp[n] = Math.min(makeOne(n / 2), makeOne(n - 1)) + 1;
            } else {
                dp[n] = makeOne(n - 1) + 1;
            }
        }
        return dp[n];
    }
}
