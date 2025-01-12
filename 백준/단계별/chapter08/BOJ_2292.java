package 단계별.chapter08;

/* https://www.acmicpc.net/problem/2292 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        int cnt = 1;
        int honeycomb = 1;
        while (honeycomb < n) {
            honeycomb += 6 * cnt;
            cnt++;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(cnt);
        System.out.print(sb);
    }
}
