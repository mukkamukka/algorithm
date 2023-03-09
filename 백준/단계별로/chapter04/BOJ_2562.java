package 단계별로.chapter04;

/* https://www.acmicpc.net/problem/2562 */

import java.io.*;

public class BOJ_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[9];
        int max = 0;
        int num = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < 9; i++) {
            if (arr[i] > max) {
                max = arr[i];
                num = i + 1;
            }
        }

        bw.write(max + "\n" + num);
        bw.close();
    }
}
