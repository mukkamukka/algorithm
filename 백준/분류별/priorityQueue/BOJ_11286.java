package 분류별.priorityQueue;

/* https://www.acmicpc.net/problem/11286 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class BOJ_11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> heap = new PriorityQueue<>( (a, b) -> {
            // 절대값이 작은 순서대로 정렬
            int absA = Math.abs(a);
            int absB = Math.abs(b);
            if (absA == absB) {
                return a - b; // 절대값이 같으면 원래 값 기준으로 정렬
            }
            return absA - absB;
        });
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
