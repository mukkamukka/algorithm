package 단계별.chapter10;

/* https://www.acmicpc.net/problem/14215 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_14215 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        br.close();

        int[] arr = {a, b, c};
        Arrays.sort(arr);
        if (arr[2] >= arr[0] + arr[1]) {
            arr[2] = arr[0] + arr[1] - 1;
        }

        int round = 0;
        for (int i : arr) {
            round += i;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(round);
        System.out.print(sb);
    }
}
