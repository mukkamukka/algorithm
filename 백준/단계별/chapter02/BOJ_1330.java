package 단계별.chapter02;

/* https://www.acmicpc.net/problem/1330 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1330 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        if (a > b) {
            sb.append(">");
        } else if (a < b) {
            sb.append("<");
        } else {
            sb.append("==");
        }
        System.out.print(sb);
    }
}
