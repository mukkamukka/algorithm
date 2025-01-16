package 단계별.chapter11;

/* https://www.acmicpc.net/problem/24266 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BOJ_24266 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());
        br.close();

        StringBuilder sb = new StringBuilder();
        sb.append(BigInteger.valueOf(n * n * n)).append("\n").append(3);
        System.out.print(sb);
    }
}
