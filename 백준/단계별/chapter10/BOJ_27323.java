package 단계별.chapter10;

/* https://www.acmicpc.net/problem/27323 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_27323 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        br.close();

        StringBuilder sb = new StringBuilder();
        sb.append(a * b);
        System.out.print(sb);
    }
}
