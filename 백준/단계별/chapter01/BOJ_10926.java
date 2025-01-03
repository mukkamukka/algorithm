package 단계별.chapter01;

/* https://www.acmicpc.net/problem/10926 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10926 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.close();

        String id = br.readLine();

        StringBuilder sb = new StringBuilder();

        sb.append(id).append("??!");
        System.out.print(sb);
    }
}
