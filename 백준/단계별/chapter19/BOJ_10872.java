package 단계별.chapter19;

/* https://www.acmicpc.net/problem/10872 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int answer = 1;
        for (int i = 0; i < n; i++) {
            answer *= i + 1;
        }

        System.out.print(answer);
    }
}
