package 단계별로.chapter07;

/* https://www.acmicpc.net/problem/2563 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int answer = n * 100;

        boolean[][] arr = new boolean[100][100];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            answer -= color(arr, x, y);
        }

        System.out.println(answer);
    }

    public static int color(boolean[][] arr, int x, int y) {
        int cnt = 0;

        for (int i = x; i < x + 10; i++) {
            for (int j = y; j < y + 10; j++) {
                if (arr[i][j]) {
                    cnt++;
                } else {
                    arr[i][j] = true;
                }
            }
        }

        return cnt;
    }
}

