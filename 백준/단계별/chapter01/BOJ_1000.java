package 단계별.chapter01;

/* https://www.acmicpc.net/problem/1000 */

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_1000 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        sb.append(a + b);
        System.out.print(sb);
    }
}
