package 단계별로.chapter03;

/* https://www.acmicpc.net/problem/10952 */

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int A, B;

        while (true) {
            st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());

            if (A == 0 && B == 0) {
                break;
            }

            bw.write(A + B + "\n");
        }

        bw.close();
    }
}
