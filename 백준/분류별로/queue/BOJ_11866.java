package 분류별로.queue;

/* https://www.acmicpc.net/problem/11866 */

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        sb.append("<");
        while (true) {
            if (queue.size() == 1) {
                sb.append(queue.poll());
                break;
            }
            for (int i = 1; i <= K; i++) {
                if (i == K) {
                    sb.append(queue.poll()).append(", ");
                } else {
                    queue.add(queue.poll());
                }
            }
        }
        sb.append(">");

        bw.write(sb.toString());
        bw.close();
    }
}
