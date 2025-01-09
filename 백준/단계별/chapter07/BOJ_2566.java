package 단계별.chapter07;

/* https://www.acmicpc.net/problem/2566 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[9][9];

        int max = Integer.MIN_VALUE;
        int col = 0;
        int row = 0;
        for (int i = 0; i < arr.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < arr[i].length; j++) {
                int num = Integer.parseInt(st.nextToken());
                arr[i][j] = num;
                if (max < num) {
                    max = num;
                    row = i;
                    col = j;
                }
            }
        }
        br.close();

        StringBuilder sb = new StringBuilder();
        sb.append(max).append("\n");
        sb.append(row + 1).append(" ").append(col + 1);
        System.out.print(sb);
    }
}
