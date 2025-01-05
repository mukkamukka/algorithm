package 단계별.chapter03;

/* https://www.acmicpc.net/problem/2439 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(" ".repeat(n - i));
            sb.append("*".repeat(i));
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
