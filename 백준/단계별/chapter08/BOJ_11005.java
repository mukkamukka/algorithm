package 단계별.chapter08;

/* https://www.acmicpc.net/problem/11005 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        br.close();

        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            if ((n % b) >= 10) {
                sb.append((char) (n % b + 55));
            } else {
                sb.append(n % b);
            }
            n /= b;
        }

        sb.reverse();
        System.out.print(sb);
    }
}
