package 단계별.chapter31;

/* https://www.acmicpc.net/problem/1806 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1806 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int[] sumArr = new int[n];
        st = new StringTokenizer(br.readLine());

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(st.nextToken());
            sumArr[i] = sum;
        }

        int start = 0;
        int end = 0;
        int min = 100001;

        while (end < n && start < n) {
            if (sumArr[end] >= s) {
                min = Math.min(min, end + 1);
            }

            if (sumArr[end] - sumArr[start] < s) {
                end++;
            } else if (sumArr[end] - sumArr[start] >= s) {
                min = Math.min(min, end - start);
                start++;
            }
        }

        if (min == 100001) min = 0;

        System.out.print(min);
    }
}
