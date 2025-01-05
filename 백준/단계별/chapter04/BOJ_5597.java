package 단계별.chapter04;

/* https://www.acmicpc.net/problem/5597 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr = new boolean[30];
        for (int i = 0; i < 28; i++) {
            int n = Integer.parseInt(br.readLine()) - 1;
            arr[n] = true;
        }
        br.close();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i]) {
                sb.append(i + 1).append("\n");
            }
        }
        System.out.print(sb);
    }
}
