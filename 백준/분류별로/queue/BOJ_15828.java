package 분류별로.queue;

/* https://www.acmicpc.net/problem/15828 */

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_15828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        int num;
        while (true) {
            num = Integer.parseInt(br.readLine());

            if (num == -1) {
                break;
            } else if (num == 0) {
                if (queue.isEmpty()) {
                    continue;
                }
                queue.poll();
            } else {
                if (queue.size() < N) {
                    queue.add(num);
                }
            }

        }

        if (queue.isEmpty()) {
            sb.append("empty");
        } else {
            for (Integer integer : queue) {
                sb.append(integer).append(" ");
            }
        }

        bw.write(sb.toString());
        bw.close();
    }
}
