package 단계별.chapter13;

/* https://www.acmicpc.net/problem/2750 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ_2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(Integer.parseInt(br.readLine()));
        }
        br.close();

        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        for (int i : arrayList) {
            sb.append(i).append("\n");
        }
        System.out.print(sb);
    }
}
