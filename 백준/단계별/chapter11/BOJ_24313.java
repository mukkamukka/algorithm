package 단계별.chapter11;

/* https://www.acmicpc.net/problem/24313 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_24313 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        br.close();

        StringBuilder sb = new StringBuilder();
        for (int i = n; i <= 100; i++) {
            if (a1 * i + a0 > c * i) {
                sb.append(0);
                break;
            }

            if (i == 100) {
                sb.append(1);
            }
        }

        System.out.print(sb);
    }
}
