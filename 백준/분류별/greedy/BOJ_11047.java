package 분류별.greedy;

/* https://www.acmicpc.net/problem/11047 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] coins = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        int i = 0;
        int cnt = 0;
        while (k > 0) {
            if (coins[i] <= k) {
                cnt += k / coins[i];
                k %= coins[i];
            }
            i++;
        }

        System.out.print(cnt);
    }
}
