package 단계별.chapter05;

/* https://www.acmicpc.net/problem/5622 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        br.close();

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int n = s.charAt(i);
            if (n < 68) {
                sum += 3;
            } else if (n < 71) {
                sum += 4;
            } else if (n < 74) {
                sum += 5;
            } else if (n < 77) {
                sum += 6;
            } else if (n < 80) {
                sum += 7;
            } else if (n < 84) {
                sum += 8;
            } else if (n < 87) {
                sum += 9;
            } else {
                sum += 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(sum);
        System.out.print(sum);
    }
}
