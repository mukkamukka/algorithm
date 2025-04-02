package 단계별.chapter31;

/* https://www.acmicpc.net/problem/2470 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2470 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
        }
        
        Arrays.sort(arr);

        int start = 0;
        int end = n - 1;
        int min = 2000000001;
        int resultLeft = 0;
        int resultRight = 0;

        while (start < end) {
            int abs = Math.abs(arr[start] + arr[end]);

            if (abs < min) {
                min = abs;
                resultLeft = arr[start];
                resultRight = arr[end];
            }

            if (arr[start] + arr[end] > 0) {
                end--;
            } else if (arr[start] + arr[end] < 0) {
                start++;
            } else {
                break;
            }
        }

        sb.append(resultLeft).append(" ").append(resultRight);
        System.out.print(sb);
    }
}
