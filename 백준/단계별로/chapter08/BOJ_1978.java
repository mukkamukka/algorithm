package 단계별로.chapter08;

/* https://www.acmicpc.net/problem/1978 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(st.nextToken());
            boolean flag = true;

            if (n == 1) {
                continue;
            }

            for (int j = 2; j * j <= n; j++) {
                if (n % j == 0) {
                    flag = false;
                }
            }

            if (flag) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
