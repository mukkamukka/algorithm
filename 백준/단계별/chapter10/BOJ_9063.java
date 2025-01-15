package 단계별.chapter10;

/* https://www.acmicpc.net/problem/9063 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_9063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE;
        int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            maxX = Math.max(maxX, x);
            minX = Math.min(minX, x);
            maxY = Math.max(maxY, y);
            minY = Math.min(minY, y);
        }
        br.close();

        StringBuilder sb = new StringBuilder();
        sb.append((maxX - minX) * (maxY - minY));
        System.out.print(sb);
    }
}
