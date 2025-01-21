package 단계별.chapter12;

/* https://www.acmicpc.net/problem/2839 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        int cnt = 0;
        while (n > 0) {
            if (n % 5 == 0) {
                cnt += n / 5;
                break;
            }

            n -= 3;
            cnt++;
        }

        if (n < 0) {
            cnt = -1;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(cnt);
        System.out.print(sb);
    }
}
