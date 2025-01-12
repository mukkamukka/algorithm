package 단계별.chapter08;

/* https://www.acmicpc.net/problem/2720 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int c = Integer.parseInt(br.readLine());
            sb.append(c / 25).append(" ");
            c %= 25;
            sb.append(c / 10).append(" ");
            c %= 10;
            sb.append(c / 5).append(" ");
            c %= 5;
            sb.append(c).append("\n");
        }
        br.close();

        System.out.print(sb);
    }
}
