package 단계별.chapter06;

/* https://www.acmicpc.net/problem/10988 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        br.close();

        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                flag = true;
                break;
            }
        }

        if (flag) {
            sb.append(0);
        } else {
            sb.append(1);
        }

        System.out.print(sb);
    }
}
