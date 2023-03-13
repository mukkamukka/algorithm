package 단계별로.chapter06;

/* https://www.acmicpc.net/problem/1157 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];
        int max = 0;
        String str = br.readLine();
        char alpha = '?';

        for (int i = 0; i < str.length(); i++) {
            arr[Character.toUpperCase(str.charAt(i)) - 'A'] += 1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                alpha = (char) (i + 'A');
            } else if (arr[i] == max) {
                alpha = '?';
            }
        }

        System.out.println(alpha);


    }
}
