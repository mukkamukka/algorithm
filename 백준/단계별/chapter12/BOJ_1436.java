package 단계별.chapter12;

/* https://www.acmicpc.net/problem/1436 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        int movie = 666;

        while (cnt < n) {
            if (String.valueOf(movie).contains("666")) {
                cnt++;
            }
            if (cnt == n) {
                break;
            }
            movie++;
        }

        System.out.print(movie);
    }
}
