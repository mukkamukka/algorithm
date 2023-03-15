package 단계별로.chapter06;

/* https://www.acmicpc.net/problem/1316 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        int index;
        String str;
        boolean[] arr;
        boolean flag;

        for (int i = 0; i < N; i++) {
            str = br.readLine();
            arr = new boolean[26];
            flag = true;

            for (int j = 0; j < str.length(); j++) {
                index = str.charAt(j) - 'a';

                if (arr[index]) {
                    if (str.charAt(j) != str.charAt(j - 1)) {
                        flag = false;
                        break;
                    }
                }

                arr[index] = true;
            }

            if (flag) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
