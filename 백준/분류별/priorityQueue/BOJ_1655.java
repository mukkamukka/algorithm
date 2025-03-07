package 분류별.priorityQueue;

/* https://www.acmicpc.net/problem/1655 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class BOJ_1655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> leftHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> rightHeap = new PriorityQueue<>();
        leftHeap.add(Integer.parseInt(br.readLine()));
        sb.append(leftHeap.peek()).append("\n");
        for (int i = 2; i <= n; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num <= leftHeap.peek()) {
                leftHeap.add(num);
            } else {
                rightHeap.add(num);
            }

            if (leftHeap.size() > rightHeap.size() + 1) {
                rightHeap.add(leftHeap.poll());
            } else if (rightHeap.size() > leftHeap.size()) {
                leftHeap.add(rightHeap.poll());
            }

            sb.append(leftHeap.peek()).append("\n");
        }

        System.out.print(sb);
    }
}
