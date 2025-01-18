package 분류별.queue;

/* https://www.acmicpc.net/problem/2161 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_2161 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        StringBuilder sb = new StringBuilder();
        while (queue.size() != 1) {
            sb.append(queue.poll()).append(" ");
            queue.add(queue.poll());
        }
        sb.append(queue.poll());

        System.out.print(sb);
    }
}
