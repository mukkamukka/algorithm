package 단계별.chapter09;

/* https://www.acmicpc.net/problem/5086 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a == 0 && b == 0) {
                break;
            }

            if (a < b && b % a == 0) {
                sb.append("factor");
            } else if (a > b && a % b == 0) {
                sb.append("multiple");
            } else {
                sb.append("neither");
            }
            sb.append("\n");
        }
        br.close();

        System.out.print(sb);
    }
}
