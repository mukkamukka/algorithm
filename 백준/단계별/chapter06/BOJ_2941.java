package 단계별.chapter06;

/* https://www.acmicpc.net/problem/2941 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        br.close();

        String[] arr = {"c=", "c-", "dz=", "d-", "z=", "s=", "nj", "lj"};
        for (String s : arr) {
            str = str.replace(s, ".");
        }

        StringBuilder sb = new StringBuilder();
        sb.append(str.length());
        System.out.print(sb);
    }
}
