package 분류별.queue;

/* https://www.acmicpc.net/problem/15828 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_15828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        while (true) {
            int packet = Integer.parseInt(br.readLine());
            if (packet == -1) {
                break;
            } else if (packet == 0) {
                queue.poll();
                continue;
            }

            if (queue.size() < n) {
                queue.add(packet);
            }
        }
        br.close();

        StringBuilder sb = new StringBuilder();
        if (queue.isEmpty()) {
            sb.append("empty");
        } else {
            for (int i : queue) {
                sb.append(i).append(" ");
            }
        }
        System.out.print(sb);
    }
}
