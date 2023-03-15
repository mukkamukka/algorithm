package 단계별로.chapter08;

/* https://www.acmicpc.net/problem/2501 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                arrayList.add(i);
            }
        }
        if (K > arrayList.size()) {
            System.out.println(0);
        } else {
            System.out.println(arrayList.get(K - 1));
        }
    }
}
