package 단계별.chapter05;

/* https://www.acmicpc.net/problem/2908 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        String strA = st.nextToken();
        String strB = st.nextToken();

        int numA = (strA.charAt(2) - 48) * 100 + (strA.charAt(1) - 48) * 10 + (strA.charAt(0) - 48);
        int numB = (strB.charAt(2) - 48) * 100 + (strB.charAt(1) - 48) * 10 + (strB.charAt(0) - 48);

        StringBuilder sb = new StringBuilder();
        sb.append(Math.max(numA, numB));
        System.out.print(sb);
    }
}
