package 단계별로.chapter06;

/* https://www.acmicpc.net/problem/4344 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int C = Integer.parseInt(br.readLine());
        double avg, sum, cnt;
        int n, score;
        int[] arr;

        for (int i = 0; i < C; i++) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            arr = new int[n];
            sum = 0;
            cnt = 0;

            for (int j = 0; j < n; j++) {
                score = Integer.parseInt(st.nextToken());
                arr[j] = score;
                sum += score;
            }

            avg = sum / n;
            for (int k : arr) {
                if (k > avg) {
                    cnt++;
                }
            }
            System.out.printf("%.3f%%\n",(cnt/n)*100);
        }
    }
}
