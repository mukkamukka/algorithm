package 단계별.chapter11;

/* https://www.acmicpc.net/problem/24265 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_24265 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        long sum = 0;
        for (int i = n - 1; i > 0; i--) {
            sum += i;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(sum).append("\n").append(2);
        System.out.print(sb);
    }
}
