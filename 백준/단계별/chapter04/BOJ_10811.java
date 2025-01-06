package 단계별.chapter04;

/* https://www.acmicpc.net/problem/10811 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for (int a = 0; a < arr.length; a++) {
            arr[a] = a + 1;
        }

        for (int a = 0; a < m; a++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()) - 1;
            int j = Integer.parseInt(st.nextToken()) - 1;

            int[] reverseArr = new int[j - i + 1];
            for (int b = j, num = 0; b >= i; b--, num++) {
                reverseArr[num] = arr[b];
            }

            for (int b = i, num = 0; b <= j; b++, num++) {
                arr[b] = reverseArr[num];
            }
        }
        br.close();

        StringBuilder sb = new StringBuilder();
        for (int a : arr) {
            sb.append(a).append(" ");
        }
        System.out.print(sb);
    }
}
