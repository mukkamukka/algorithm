package 단계별.chapter08;

/* https://www.acmicpc.net/problem/2869 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());
        double v = Double.parseDouble(st.nextToken());

        int day = (int) Math.ceil((v - b) / (a - b));
        StringBuilder sb = new StringBuilder();
        sb.append(day);
        System.out.print(sb);
    }
}
