package 단계별.chapter02;

/* https://www.acmicpc.net/problem/9498 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9498 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int score = Integer.parseInt(br.readLine());
        br.close();

        StringBuilder sb = new StringBuilder();
        if (score > 89) {
            sb.append("A");
        } else if (score > 79) {
            sb.append("B");
        } else if (score > 69) {
            sb.append("C");
        } else if (score > 59) {
            sb.append("D");
        } else {
            sb.append("F");
        }
        System.out.print(sb);
    }
}
