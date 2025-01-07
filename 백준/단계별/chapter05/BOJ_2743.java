package 단계별.chapter05;

/* https://www.acmicpc.net/problem/2743 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2743 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        br.close();

        StringBuilder sb = new StringBuilder();
        sb.append(s.length());
        System.out.print(sb);
    }
}
