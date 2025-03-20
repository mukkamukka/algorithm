package 단계별.chapter19;

/* https://www.acmicpc.net/problem/1010 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int west = Integer.parseInt(st.nextToken());
            int east = Integer.parseInt(st.nextToken());

            sb.append(bridge(west, east)).append("\n");
        }

        System.out.print(sb);
    }

    public static long bridge(int west, int east) {
        if (west == east) return 1;

        long answer = 1;
        for (int i = 0; i < west; i++) {
            answer *= (east - i);
            answer /= (i + 1);
        }

        return answer;
    }
}
