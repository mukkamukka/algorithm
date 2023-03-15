package 단계별로.chapter07;

/* https://www.acmicpc.net/problem/2738 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[][] arrA = new int[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())];

        for (int i = 0; i < arrA.length; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < arrA[i].length; j++) {
                arrA[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < arrA.length; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < arrA[i].length; j++) {
                arrA[i][j] += Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrA[i].length; j++) {
                System.out.print(arrA[i][j] + " ");
            }
            System.out.println();
        }
    }
}
