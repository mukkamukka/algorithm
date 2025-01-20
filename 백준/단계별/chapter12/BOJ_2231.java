package 단계별.chapter12;

/* https://www.acmicpc.net/problem/2231 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        int min = 0;
        for (int i = 0; i < n; i++) {
            int sum = i;
            int num = i;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            if (sum == n) {
                min = i;
                break;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(min);
        System.out.print(sb);
    }
}
