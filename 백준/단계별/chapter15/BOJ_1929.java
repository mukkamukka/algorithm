package 단계별.chapter15;

/* https://www.acmicpc.net/problem/1929 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        br.close();

        StringBuilder sb = new StringBuilder();
        for (int i = m; i <= n; i++) {
            if (i == 1) {
                continue;
            }

            boolean flag = true;
            for (int j = 2; Math.pow(j, 2) <= i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                sb.append(i).append("\n");
            }
        }

        System.out.print(sb);
    }
}
