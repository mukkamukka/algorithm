package 분류별.hash;

/* https://www.acmicpc.net/problem/9375 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            HashMap<String, Integer> hm = new HashMap<>();
            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                String str = st.nextToken();
                hm.put(str, hm.getOrDefault(str, 0) + 1);
            }

            int result = 1;
            for (int j : hm.values()) {
                result *= (j + 1);
            }

            sb.append(result - 1).append("\n");
        }
        br.close();

        System.out.print(sb);
    }
}
