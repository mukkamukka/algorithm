package 분류별.priorityQueue;

/* https://www.acmicpc.net/problem/1927 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class BOJ_1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0) {
                if (heap.isEmpty()) {
                    sb.append(0);
                } else {
                    sb.append(heap.poll());
                }
                sb.append("\n");
            } else {
                heap.add(num);
            }
        }

        System.out.print(sb);
    }
}
