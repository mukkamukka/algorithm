package 분류별로.queue;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

/* https://www.acmicpc.net/problem/2161 */

public class BOJ_2161 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        while (!queue.isEmpty()){
            if (queue.size() == 1) {
                sb.append(queue.poll()).append(" ");
                break;
            }
            sb.append(queue.poll()).append(" ");
            queue.add(queue.poll());
        }

        bw.write(sb.toString());
        bw.close();
    }
}
