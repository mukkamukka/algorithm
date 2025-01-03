package 단계별.chapter01;

/* https://www.acmicpc.net/problem/10869 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        sb.append(a + b).append("\n");
        sb.append(a - b).append("\n");
        sb.append(a * b).append("\n");
        sb.append(a / b).append("\n");
        sb.append(a % b);
        System.out.print(sb);
    }
}
