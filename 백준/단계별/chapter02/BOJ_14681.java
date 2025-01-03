package 단계별.chapter02;

/* https://www.acmicpc.net/problem/14681 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_14681 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        br.close();

        StringBuilder sb = new StringBuilder();
        if (x > 0) {
            if (y > 0) {
                sb.append(1);
            } else {
                sb.append(4);
            }
        } else {
            if (y > 0) {
                sb.append(2);
            } else {
                sb.append(3);
            }
        }
        System.out.print(sb);
    }
}
