package 단계별.chapter21;

/* https://www.acmicpc.net/problem/27433 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_27433 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(recursion(n));
    }

    public static long recursion(int n) {
        if (n <= 0) return 1;

        return n * recursion(n - 1);
    }
}
