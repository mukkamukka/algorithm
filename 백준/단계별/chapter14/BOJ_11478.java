package 단계별.chapter14;

/* https://www.acmicpc.net/problem/11478 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BOJ_11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        br.close();

        HashSet<String> hs = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String str = s.substring(i, j + 1);
                hs.add(str);
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(hs.size());
        System.out.print(sb);
    }
}
