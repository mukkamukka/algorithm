package 단계별.chapter15;

/* https://www.acmicpc.net/problem/17103 */

import java.io.*;

public class BOJ_17103 {
    static int max = 1000000;
    static boolean[] primes = new boolean[max + 1];

    public static void erasto() {
        for (int i = 2; i <= max; i++) primes[i] = true;
        primes[0] = primes[1] = false;

        for (int i = 2; i * i <= max; i++) {
            if (primes[i]) {
                for (int j = i * i; j <= max; j += i) {
                    primes[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        erasto();

        while (t-- > 0){
            int num = Integer.parseInt(br.readLine());
            int cnt = 0;

            for (int j = 2; j <= num / 2; j++) {
                if (primes[j] && primes[num - j]) {
                    cnt++;
                }
            }

            sb.append(cnt).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
