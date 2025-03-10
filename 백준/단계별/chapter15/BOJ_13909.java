package 단계별.chapter15;

/* https://www.acmicpc.net/problem/13909 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_13909 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        sb.append((int) Math.sqrt(n));

/* 규칙을 찾기 위한 풀이 코드 */
/* n의 범위가 21억까지여서 메모리초과가 난다 */
//        int n = Integer.parseInt(br.readLine()) + 1;
//
//        boolean[] arr = new boolean[n];
//        for (int i = 1; i < n; i++) {
//            for (int j = i; j < n; j += i) {
//                if (j % i == 0) {
//                    arr[j] = !arr[j];
//                }
//            }
//        }
//
//        int cnt = 0;
//        for (boolean b : arr) {
//            if (b) {
//                cnt++;
//            }
//        }
//
//        sb.append(cnt);

        System.out.print(sb);
    }
}
