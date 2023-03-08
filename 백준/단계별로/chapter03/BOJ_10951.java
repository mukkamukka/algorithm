package 단계별로.chapter03;

/* https://www.acmicpc.net/problem/10951 */

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String str;
        int a,b;

        while ((str = br.readLine()) != null) {
            st = new StringTokenizer(str);
            a= Integer.parseInt(st.nextToken());
            b= Integer.parseInt(st.nextToken());
            sb.append(a + b).append("\n");
        }

        System.out.print(sb);
    }
}
