package 분류별.hash;

/* https://www.acmicpc.net/problem/14425 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hm.put(br.readLine(), 1);
        }

        int cnt = 0;
        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            if (hm.containsKey(str)) {
                cnt++;
            }
        }
        br.close();

        StringBuilder sb = new StringBuilder();
        sb.append(cnt);
        System.out.print(sb);
    }
}
