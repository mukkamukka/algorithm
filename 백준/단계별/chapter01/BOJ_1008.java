package 단계별.chapter01;

/* https://www.acmicpc.net/problem/1008 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1008 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        double a = Integer.parseInt(st.nextToken());
        double b = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        sb.append(a / b);
        System.out.print(sb);
    }
}
