package 단계별로.chapter05;

/* https://www.acmicpc.net/problem/11718 */

import java.io.*;

public class BOJ_11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String str;

        while ((str = br.readLine()) != null) {
            sb.append(str).append("\n");
        }

        bw.write(sb.toString());
        bw.close();
    }
}
