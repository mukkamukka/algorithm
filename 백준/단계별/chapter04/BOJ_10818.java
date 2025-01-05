package 단계별.chapter04;

/* https://www.acmicpc.net/problem/10818 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(min).append(" ").append(max);
        System.out.print(sb);
    }
}
