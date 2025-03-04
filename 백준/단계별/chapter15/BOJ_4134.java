package 단계별.chapter15;

/* https://www.acmicpc.net/problem/4134 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4134 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            long n = Long.parseLong(br.readLine());

            if (n <= 2) {
                sb.append(2).append("\n");
                continue;
            }

            while (true) {
                boolean flag = true;

                for (int j = 2; j <= (int) Math.sqrt(n); j++) {
                    if (n % j == 0) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    sb.append(n).append("\n");
                    break;
                }

                n++;
            }
        }
        br.close();

        System.out.print(sb);
    }
}
