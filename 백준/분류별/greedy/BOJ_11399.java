package 분류별.greedy;

/* https://www.acmicpc.net/problem/11399 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int minTime = 0;
        int timeSum = 0;
        for (int i = 0; i < n; i++) {
            timeSum += arr[i];
            minTime += timeSum;
        }

        System.out.print(minTime);
    }
}
