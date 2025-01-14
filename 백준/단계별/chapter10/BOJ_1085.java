package 단계별.chapter10;

/* https://www.acmicpc.net/problem/1085 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        br.close();

        int minX = Math.min(x, w - x);
        int minY = Math.min(y, h - y);

        StringBuilder sb = new StringBuilder();
        sb.append(Math.min(minX, minY));
        System.out.print(sb);
    }
}
