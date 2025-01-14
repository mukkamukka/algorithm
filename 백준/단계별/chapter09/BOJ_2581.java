package 단계별.chapter09;

/* https://www.acmicpc.net/problem/2581 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        br.close();

        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = m; i <= n; i++) {

            int cnt = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
                if (cnt == 2) {
                    break;
                }
            }
            if (cnt == 1) {
                sum += i;
                if (min > i) {
                    min = i;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        if (sum == 0) {
            sb.append(-1);
        } else {
            sb.append(sum).append("\n").append(min);
        }
        System.out.print(sb);
    }
}
