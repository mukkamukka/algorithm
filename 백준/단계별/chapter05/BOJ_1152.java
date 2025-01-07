package 단계별.chapter05;

/* https://www.acmicpc.net/problem/1152 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        StringBuilder sb = new StringBuilder();
        int cnt = st.countTokens();
        sb.append(cnt);
        System.out.print(sb);
    }
}
