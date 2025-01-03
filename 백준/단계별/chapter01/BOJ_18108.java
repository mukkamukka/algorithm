package 단계별.chapter01;

/* https://www.acmicpc.net/problem/18108 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_18108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.close();

        int year = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        sb.append(year - 543);
        System.out.print(sb);
    }
}
