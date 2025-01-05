package 단계별.chapter04;

/* https://www.acmicpc.net/problem/10810 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for (int a = 1; a <= m; a++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()) - 1;
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            for (int b = i; b < j; b++) {
                arr[b] = k;
            }
        }
        br.close();

        StringBuilder sb = new StringBuilder();
        for (int a : arr) {
            sb.append(a).append(" ");
        }
        System.out.print(sb);
    }
}
