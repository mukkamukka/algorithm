package 단계별로.chapter02;

/* https://www.acmicpc.net/problem/2525 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(br.readLine());

        if (B + C >= 60) {
            A += (B + C) / 60;
            B += C % 60;
        } else {
            B += C;
        }

        if (A >= 24) {
            A -= 24;
        }

        if (B >= 60) {
            B -= 60;
        }

        System.out.println(A + " " + B);
    }
}
