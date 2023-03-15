package 단계별로.chapter08;

/* https://www.acmicpc.net/problem/9506 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        while (true) {
            int n = Integer.parseInt(br.readLine());
            int cnt = 0;
            ArrayList<Integer> arrayList = new ArrayList<>();

            if (n == -1) {
                break;
            }

            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    cnt += i;
                    arrayList.add(i);
                }
            }

            if (n == cnt) {
                System.out.print(n + " = ");
                for (int i = 0; i < arrayList.size(); i++) {
                    System.out.print(arrayList.get(i));
                    if (arrayList.size() - i > 1) {
                        System.out.print(" + ");
                    } else if (arrayList.size() - i == 1) {
                        System.out.println();
                    }
                }
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
    }
}
