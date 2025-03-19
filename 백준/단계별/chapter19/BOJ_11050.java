package 단계별.chapter19;

/* https://www.acmicpc.net/problem/11050 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int nFactorial = 1;
        int kFactorial = 1;
        int nMinusKFactorial = 1;
        for (int i = 1; i <= n; i++) {
            if (k >= i) {
                kFactorial *= i;
            }
            if (n - k >= i) {
                nMinusKFactorial *= i;
            }
            nFactorial *= i;
        }

        System.out.print(nFactorial / (kFactorial * nMinusKFactorial));
    }
}
