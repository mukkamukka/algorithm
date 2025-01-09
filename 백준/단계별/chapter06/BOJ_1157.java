package 단계별.chapter06;

/* https://www.acmicpc.net/problem/1157 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        br.close();

        int[] arr = new int[26];
        for (int i = 0; i < str.length(); i++) {
            int num = Character.toUpperCase(str.charAt(i)) - 'A';
            arr[num] += 1;
        }

        int max = Integer.MIN_VALUE;
        char result = ' ';
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                result = (char) (i + 'A');
            } else if (arr[i] == max) {
                result = '?';
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(result);
        System.out.print(sb);
    }
}
