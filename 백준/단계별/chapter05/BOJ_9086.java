package 단계별.chapter05;

/* https://www.acmicpc.net/problem/9086 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            String s = br.readLine();

            if (s.length() == 1) {
                sb.append(s).append(s);
            } else {
                sb.append(s.charAt(0)).append(s.charAt(s.length() - 1));
            }
            sb.append("\n");
        }
        br.close();

        System.out.print(sb);
    }
}
