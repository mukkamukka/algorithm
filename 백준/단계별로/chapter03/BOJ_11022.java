package 단계별로.chapter03;

/* https://www.acmicpc.net/problem/11022 */

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        int a, b;

        for (int i = 1; i <= T; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b= Integer.parseInt(st.nextToken());

            bw.write("Case #" + i + ": " + a + " + " + b + " = " + (a + b) + "\n");
        }

        bw.close();
    }
}
