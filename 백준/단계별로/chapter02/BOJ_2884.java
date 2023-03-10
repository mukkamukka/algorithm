package 단계별로.chapter02;

/* https://www.acmicpc.net/problem/2884 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if (M < 45) {
            if (H == 0) {
                H = 24;
            }
            H -= 1;
            M += 15;
        } else {
            M -= 45;
        }

        System.out.println(H + " " + M);
    }
}
