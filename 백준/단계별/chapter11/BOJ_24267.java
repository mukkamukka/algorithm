package 단계별.chapter11;

/* https://www.acmicpc.net/problem/24267 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_24267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());
        br.close();

        long sum = 0;
        long num = 0;
        for (long i = 1; i <= n - 2; i++) {
            sum += i + num;
            num += i;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(sum).append("\n").append(3);
        System.out.print(sb);
    }
}
