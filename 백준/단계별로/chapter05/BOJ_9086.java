package 단계별로.chapter05;

/* https://www.acmicpc.net/problem/9086 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;

        int T = Integer.parseInt(br.readLine());
        String str;

        for (int i = 0; i < T; i++) {
            sb =  new StringBuilder();
            str = br.readLine();
            sb.append(str.charAt(0)).append(str.charAt(str.length() - 1));
            System.out.println(sb);
        }
    }
}
