package 단계별로.chapter03;

/* https://www.acmicpc.net/problem/25314 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine()) / 4;

        for (int i = 0; i < N; i++) {
            sb.append("long ");
        }

        sb.append("int");
        System.out.println(sb);
    }
}
