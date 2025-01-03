package 단계별.chapter01;

/* https://www.acmicpc.net/problem/2588 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        br.close();

        StringBuilder sb = new StringBuilder();

        sb.append((b % 10) * a).append("\n");
        sb.append(((b % 100) / 10) * a).append("\n");
        sb.append((b / 100) * a).append("\n");
        sb.append(a * b);
        System.out.print(sb);
    }
}
