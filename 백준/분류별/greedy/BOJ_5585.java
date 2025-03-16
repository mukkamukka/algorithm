package 분류별.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5585 {
    static int[] coins = {500, 100, 50, 10, 5, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int change = 1000 - Integer.parseInt(br.readLine());
        int i  = 0;
        int cnt = 0;

        while (change > 0) {
            if (change >= coins[i]) {
                cnt += change / coins[i];
                change %= coins[i];
            }
            i++;
        }

        System.out.print(cnt);
    }
}
