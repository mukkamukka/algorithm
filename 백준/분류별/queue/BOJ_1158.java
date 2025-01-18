package 분류별.queue;

/* https://www.acmicpc.net/problem/1158 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        br.close();

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while (true) {
            for (int i = 1; i < k; i++) {
                queue.add(queue.poll());
            }
            sb.append(queue.poll());
            if (queue.isEmpty()) {
                sb.append(">");
                break;
            }
            sb.append(", ");
        }
        System.out.print(sb);
    }
}
