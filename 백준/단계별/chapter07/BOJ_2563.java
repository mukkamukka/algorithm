package 단계별.chapter07;

/* https://www.acmicpc.net/problem/2563 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int extent = n * 100;

        boolean[][] arr = new boolean[100][100];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            int cnt = 0;
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    if (arr[j][k]) {
                        cnt++;
                    } else {
                        arr[j][k] = true;
                    }
                }
            }

            extent -= cnt;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(extent);
        System.out.print(sb);
    }
}
