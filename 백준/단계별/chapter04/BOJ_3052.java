package 단계별.chapter04;

/* https://www.acmicpc.net/problem/3052 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(br.readLine()) % 42;
        }
        br.close();

        int cnt = 10;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                if (num == arr[j]) {
                    cnt--;
                    break;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(cnt);
        System.out.print(sb);
    }
}
