package 분류별.priorityQueue;

/* https://www.acmicpc.net/problem/1715 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class BOJ_1715 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            heap.add(Integer.parseInt(br.readLine()));
        }

        int answer = 0;
        while (heap.size() > 1) {
            int num = heap.poll() + heap.poll();
            answer += num;
            heap.add(num);
        }

        sb.append(answer);
        System.out.print(sb);
    }
}
