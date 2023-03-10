package 단계별로.chapter05;

/* https://www.acmicpc.net/problem/5622*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int sum = str.length();
        String[] arr = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr[j].length(); k++) {
                    if (arr[j].charAt(k) == str.charAt(i)) {
                        sum += j + 2;
                    }
                }
            }
        }

        System.out.println(sum);
    }
}
