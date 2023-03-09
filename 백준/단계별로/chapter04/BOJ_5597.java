package 단계별로.chapter04;

/* https://www.acmicpc.net/problem/5597 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[30];
        int num;

        for (int i = 0; i < 30; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < 28; i++) {
            num = Integer.parseInt(br.readLine());

            for (int j = 0; j < 30; j++) {
                if (arr[j] == num) {
                    arr[j] = 0;
                }
            }
        }

        for (int i = 0; i < 30; i++) {
            if (arr[i] != 0) {
                sb.append(i + 1).append("\n");
            }
        }

        System.out.println(sb);
    }
}
