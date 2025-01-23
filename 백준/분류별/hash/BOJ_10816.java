package 분류별.hash;

/* https://www.acmicpc.net/problem/10816 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        br.close();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            sb.append(hm.getOrDefault(Integer.parseInt(st.nextToken()), 0)).append(" ");
        }
        br.close();

        System.out.print(sb);
    }
}
