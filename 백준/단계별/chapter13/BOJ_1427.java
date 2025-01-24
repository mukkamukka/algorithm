package 단계별.chapter13;

/* https://www.acmicpc.net/problem/1427 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        br.close();

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n.length(); i++) {
            arrayList.add((int) n.charAt(i) - '0');
        }

        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        for (int i : arrayList) {
            sb.append(i);
        }
        System.out.print(sb.reverse());
    }
}
