package 단계별.chapter13;

/* https://www.acmicpc.net/problem/10989 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[10001];

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[num]++;
        }

        for (int i = 1; i < 10001; i++) {
            for (int j = 0; j < arr[i]; j++) {
                sb.append(i).append("\n");
            }
        }

        System.out.print(sb);
    }
}
