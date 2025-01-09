package 단계별.chapter06;

/* https://www.acmicpc.net/problem/1316 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int cnt = n;
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            ArrayList<Character> arrayList = new ArrayList<>();
            char beforeAlpha = ' ';
            for (int j = 0; j < str.length(); j++) {
                char alpha = str.charAt(j);
                if (beforeAlpha == alpha) {
                    continue;
                }
                if (arrayList.contains(alpha)) {
                    cnt--;
                    break;
                }
                arrayList.add(alpha);
                beforeAlpha = alpha;
            }
        }
        br.close();

        StringBuilder sb = new StringBuilder();
        sb.append(cnt);
        System.out.print(sb);
    }
}
