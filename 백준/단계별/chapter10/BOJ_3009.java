package 단계별.chapter10;

/* https://www.acmicpc.net/problem/3009 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> arrayListX = new ArrayList<>();
        ArrayList<Integer> arrayListY = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if (arrayListX.contains(x)) {
                arrayListX.remove(Integer.valueOf(x));
            } else {
                arrayListX.add(x);
            }
            if (arrayListY.contains(y)) {
                arrayListY.remove(Integer.valueOf(y));
            } else {
                arrayListY.add(y);
            }
        }
        br.close();

        StringBuilder sb = new StringBuilder();
        for (int i: arrayListX) {
            sb.append(i);
        }
        sb.append(" ");
        for (int i : arrayListY) {
            sb.append(i);
        }
        System.out.print(sb);
    }
}
