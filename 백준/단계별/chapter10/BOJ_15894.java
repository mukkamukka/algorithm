package 단계별.chapter10;

/* https://www.acmicpc.net/problem/15894 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_15894 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        br.close();

        StringBuilder sb = new StringBuilder();
        sb.append(n * 4);
        System.out.print(sb);
    }
}
