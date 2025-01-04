package 단계별.chapter02;

/* https://www.acmicpc.net/problem/2480 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        br.close();

        int max = 0;
        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else {
            max = c;
        }

        StringBuilder sb = new StringBuilder();
        if (a == b && b == c) {
            sb.append(10000 + (a * 1000));
        } else if (a == b) {
            sb.append(1000 + (a * 100));
        } else if (b == c) {
            sb.append(1000 + (b * 100));
        } else if (a == c) {
            sb.append(1000 + (a * 100));
        } else {
            sb.append(max * 100);
        }

        System.out.print(sb);
    }
}
