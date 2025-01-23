package 분류별.hash;

/* https://www.acmicpc.net/problem/1764 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < n + m; i++) {
            String name = br.readLine();
            hm.put(name, hm.getOrDefault(name, 0) + 1);
        }
        br.close();

        int cnt = 0;
        ArrayList<String> arrayList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == 2) {
                arrayList.add(entry.getKey());
                cnt++;
            }
        }
        Collections.sort(arrayList);

        StringBuilder sb = new StringBuilder();
        sb.append(cnt).append("\n");
        for (String str : arrayList) {
            sb.append(str).append("\n");
        }
        System.out.print(sb);
    }
}
