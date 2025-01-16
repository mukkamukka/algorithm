package 단계별.chapter10;

/* https://www.acmicpc.net/problem/5073 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            int max = Math.max(Math.max(a, b), c);
            if (max == a) {
                if (a >= b + c) {
                    sb.append("Invalid").append("\n");
                    continue;
                }
            } else if (max == b) {
                if (b >= c + a) {
                    sb.append("Invalid").append("\n");
                    continue;
                }
            } else {
                if (c >= a + b) {
                    sb.append("Invalid").append("\n");
                    continue;
                }
            }

            if (a == b && b == c) {
                sb.append("Equilateral");
            } else if (a != b && b != c && c != a) {
                sb.append("Scalene");
            } else {
                sb.append("Isosceles");
            }
            sb.append("\n");
        }
        br.close();

        System.out.print(sb);
    }
}
