package 단계별로.chapter06;

/* https://www.acmicpc.net/problem/10988*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int strLength = str.length();
        boolean flag = true;

        char[] arr = new char[strLength];

        for (int i = 0; i < strLength; i++) {
            arr[i] = str.charAt(i);
        }

        if (str.length() % 2 == 1) {
            for (int i = 0; i < str.length() / 2 - 1; i++) {
                if (arr[i] != arr[strLength - i - 1]) {
                    flag = false;
                    break;
                }
            }
        } else {
            for (int i = 0; i < str.length() / 2; i++) {
                if (arr[i] != arr[strLength - i - 1]) {
                    flag = false;
                    break;
                }
            }
        }

        if (flag) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
