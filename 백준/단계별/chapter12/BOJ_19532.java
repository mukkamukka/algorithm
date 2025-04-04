package 단계별.chapter12;

/* https://www.acmicpc.net/problem/19532 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_19532 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        int x = 0;
        int y = 0;
        for (int i = -999; i <= 999; i++) {
            for (int j = -999; j <= 999; j++) {
                if ((a * i) + (b * j) == c && (d * i) + (e * j) == f) {
                    x = i;
                    y = j;
                    break;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(x).append(" ").append(y);
        System.out.print(sb);
    }
}
