package 단계별.chapter02;

/* https://www.acmicpc.net/problem/2753 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2753 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(br.readLine());
        br.close();

        StringBuilder sb = new StringBuilder();
        if (year % 4 == 0 && year % 100 != 0) {
            sb.append(1);
        } else if (year % 400 == 0) {
            sb.append(1);
        } else {
            sb.append(0);
        }
        System.out.print(sb);
    }
}
