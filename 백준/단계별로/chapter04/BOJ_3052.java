package 단계별로.chapter04;

/* https://www.acmicpc.net/problem/3052 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];
        int cnt = 1;

        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(br.readLine()) % 42;
        }

        Arrays.sort(arr);

        int num = arr[0];
        for (int i = 1; i < 10; i++) {
            if (num != arr[i]) {
                cnt++;
                num = arr[i];
            }
        }

        System.out.println(cnt);
    }
}
