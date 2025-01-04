package 단계별.chapter02;

/* https://www.acmicpc.net/problem/2884 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if (m < 45) {
            if (h == 0) {
                h = 24;
            }
            h -= 1;
            m = 60 - (45 - m);
        } else {
            m -= 45;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(h).append(" ").append(m);
        System.out.print(sb);
    }
}
