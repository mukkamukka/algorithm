package 단계별.chapter13;

/* https://www.acmicpc.net/problem/2587 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(br.readLine());
            sum += num;
            arr[i] = num;
        }
        br.close();
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        sb.append(sum / 5).append("\n").append(arr[2]);
        System.out.print(sb);
    }
}
