package 단계별.chapter15;

/* https://www.acmicpc.net/problem/4948 */

import java.io.*;

public class BOJ_4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = 123456 * 2;
        boolean[] primes = new boolean[max + 1];

        for (int i = 2; i <= max; i++) primes[i] = true;
        primes[0] = primes[1] = false;

        for (int i = 2; i * i <= max; i++) {
            if (primes[i]) {
                for (int j = i * i; j <= max; j += i) {
                    primes[j] = false;
                }
            }
        }

        while (true) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) break;

            int cnt = 0;
            for (int i = num + 1; i <= num * 2; i++) {
                if (primes[i]) {
                    cnt++;
                }
            }

            bw.write(cnt + "\n");
        }

        bw.flush();
        bw.close();
    }
}
