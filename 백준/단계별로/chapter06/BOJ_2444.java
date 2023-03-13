package 단계별로.chapter06;

/* https://www.acmicpc.net/problem/2444*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            for (int j = N - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 2 * (N -  i) + 1; k < 2 * N; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= N - 1; i++) {
            for (int j = N - i; j < N; j++) {
                System.out.print(" ");
            }
            for (int k = 2 * i + 1; k < 2 * N; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
