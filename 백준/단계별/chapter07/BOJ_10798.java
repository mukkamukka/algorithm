package 단계별.chapter07;

/* https://www.acmicpc.net/problem/10798 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<char[]> arrayList = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            String str = br.readLine();
            if (max < str.length()) {
                max = str.length();
            }
            char[] arr = new char[str.length()];
            for (int j = 0; j < str.length(); j++) {
                arr[j] = str.charAt(j);
            }
            arrayList.add(arr);
        }
        br.close();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {
                char[] arr = arrayList.get(j);
                if (i < arr.length) {
                    sb.append(arr[i]);
                }
            }
        }
        System.out.print(sb);
    }
}

