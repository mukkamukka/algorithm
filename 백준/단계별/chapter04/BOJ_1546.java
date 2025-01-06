package 단계별.chapter04;

/* https://www.acmicpc.net/problem/1546 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        double[] arr = new double[n];
        double max = Double.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            double num = Double.parseDouble(st.nextToken());
            arr[i] = num;

            if (num > max) {
                max = num;
            }
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i] / max * 100;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(sum / n);
        System.out.print(sb);
    }
}
