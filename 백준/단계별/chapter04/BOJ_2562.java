package 단계별.chapter04;

/* https://www.acmicpc.net/problem/2562 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        int max = Integer.MIN_VALUE;
        int maxCnt = 0;
        for (int i = 0; i < 9; i++) {
            int num = arr[i];
            if (num > max) {
                max = num;
                maxCnt = i + 1;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(max).append("\n").append(maxCnt);
        System.out.print(sb);
    }
}
