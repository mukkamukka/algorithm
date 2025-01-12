package 단계별.chapter08;

/* https://www.acmicpc.net/problem/2745 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        br.close();

        int result = 0;
        for (int i = n.length() - 1, j = 0; i >= 0; i--, j++) {
            int num = 0;
            if (n.charAt(i) < 'A') {
                num = n.charAt(i) - 48;
            } else {
                num = (Character.toUpperCase(n.charAt(i)) - 55);
            }
            result += num * Math.pow(b, j);
        }

        StringBuilder sb = new StringBuilder();
        sb.append(result);
        System.out.print(sb);
    }
}
