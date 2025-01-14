package 단계별.chapter09;

/* https://www.acmicpc.net/problem/1978 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int result = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            int cnt = 0;
            for (int j = 1; j < num; j++) {
                if (num % j == 0) {
                    cnt++;
                }
                if (cnt == 2) {
                    break;
                }
            }
            if (cnt == 1) {
                result++;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(result);
        System.out.print(sb);
    }
}
