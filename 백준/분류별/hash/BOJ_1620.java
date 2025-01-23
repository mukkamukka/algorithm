package 분류별.hash;

/* https://www.acmicpc.net/problem/1620 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, String> hm = new HashMap<>();
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            hm.put(name, String.valueOf(i));
            arrayList.add(name);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            if (isStringOrNumber(str)) {
                sb.append(arrayList.get(Integer.parseInt(str) - 1))
                        .append("\n");
            } else {
                sb.append(hm.get(str)).append("\n");
            }
        }
        br.close();

        System.out.print(sb);
    }

    public static boolean isStringOrNumber(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
