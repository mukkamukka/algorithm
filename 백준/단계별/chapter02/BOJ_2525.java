package 단계별.chapter02;

/* https://www.acmicpc.net/problem/2525 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        br.close();

        if (c < 60) {
            b += c;
        } else {
            a += c / 60;
            b += c % 60;
        }

        if (b >= 60) {
            a++;
            b -= 60;
        }

        if (a >= 24) {
            a -= 24;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(a).append(" ").append(b);
        System.out.print(sb);
    }
}
