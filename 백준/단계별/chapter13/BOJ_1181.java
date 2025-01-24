package 단계별.chapter13;

/* https://www.acmicpc.net/problem/1181 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(br.readLine());
        }
        br.close();

        Collections.sort(arrayList, (e1, e2) -> {
            if (e1.length() == e2.length()) {
                return e1.compareTo(e2);
            } else {
                return e1.length() - e2.length();
            }
        });

        StringBuilder sb = new StringBuilder();
        sb.append(arrayList.get(0)).append("\n");
        for (int i = 1; i < n; i++) {
            if (!arrayList.get(i).equals(arrayList.get(i - 1))) {
                sb.append(arrayList.get(i)).append("\n");
            }
        }
        System.out.print(sb);
    }
}
