package 단계별.chapter09;

/* https://www.acmicpc.net/problem/11653 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        StringBuilder sb = new StringBuilder();
        int num = 2;
        while (n != 1) {
            if (n % num == 0) {
                sb.append(num).append("\n");
                n /= num;
            } else {
                num++;
            }
        }
        System.out.print(sb);
    }
}
