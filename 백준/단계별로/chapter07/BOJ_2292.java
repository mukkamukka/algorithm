package 단계별로.chapter07;

/* https://www.acmicpc.net/problem/2292 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 1;
        int i = 1;
        int num = 1;

        while (num < N) {
            num += 6 * i;
            i++;
            cnt++;
        }
        System.out.println(cnt);
    }
}
