package 분류별.deque;

/* https://www.acmicpc.net/problem/2346 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ_2346 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        Deque<int[]> deque = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            int[] arr = new int[2];
            arr[0] = i;
            arr[1] = Integer.parseInt(st.nextToken());
            deque.add(arr);
        }

        StringBuilder sb = new StringBuilder();
        while (!deque.isEmpty()) {
            int[] balloon = deque.pollFirst();
            sb.append(balloon[0]).append(" ");
            int num = balloon[1];

            if (deque.isEmpty()) break;

            if (num > 0) {
                for (int i = 0; i < num - 1; i++) {
                    deque.addLast(deque.pollFirst());
                }
            } else {
                for (int i = 0; i < Math.abs(num); i++) {
                    deque.addFirst(deque.pollLast());
                }
            }
        }

        System.out.print(sb);
    }
}
