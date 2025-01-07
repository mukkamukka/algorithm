package 단계별.chapter05;

/* https://www.acmicpc.net/problem/11720 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        br.close();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += s.charAt(i) - 48;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(sum);
        System.out.print(sb);
    }
}
