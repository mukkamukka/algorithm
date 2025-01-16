package 단계별.chapter11;

/* https://www.acmicpc.net/problem/24264 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_24264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        StringBuilder sb = new StringBuilder();
        sb.append((long) Math.pow(n, 2)).append("\n").append(2);
        System.out.print(sb);
    }
}
