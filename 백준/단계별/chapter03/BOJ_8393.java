package 단계별.chapter03;

/* https://www.acmicpc.net/problem/8393 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(sum);
        System.out.print(sb);
    }
}
