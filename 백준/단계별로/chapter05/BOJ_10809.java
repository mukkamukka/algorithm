package 단계별로.chapter05;

/* https://www.acmicpc.net/problem/10809 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int[] alpha = new int[26];

        for (int i = 0; i < 26; i++) {
            alpha[i] = -1;
        }

        for (int i = 0; i < str.length(); i++) {
            if (alpha[str.charAt(i) - 'a'] == -1) {
                alpha[str.charAt(i) - 'a'] = i;
            }
        }

        for (int i : alpha) {
            System.out.print(i + " ");
        }
    }
}
