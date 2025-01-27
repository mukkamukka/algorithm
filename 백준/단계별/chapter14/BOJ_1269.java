package 단계별.chapter14;

/* https://www.acmicpc.net/problem/1269 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int aSize = Integer.parseInt(st.nextToken());
        int bSize = Integer.parseInt(st.nextToken());

        HashMap<Integer, Integer> hm = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < aSize; i++) {
            hm.put(Integer.parseInt(st.nextToken()), 1);
        }

        st = new StringTokenizer(br.readLine());
        br.close();
        for (int i = 0; i < bSize; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (hm.containsKey(num)) {
                hm.remove(num);
            } else {
                hm.put(num, 1);
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(hm.size());
        System.out.print(sb);
    }
}
