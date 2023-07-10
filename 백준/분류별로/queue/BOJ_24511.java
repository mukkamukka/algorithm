package 분류별로.queue;

/* https://www.acmicpc.net/problem/24511 */

import java.io.*;
import java.util.*;

public class BOJ_24511 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> queueStack = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st2.nextToken());

            if (Integer.parseInt(st.nextToken()) == 0) {
                queueStack.add(num);
            }
        }

        int m = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        StringTokenizer st3 = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            queue.add(Integer.parseInt(st3.nextToken()));
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(calculator(queueStack, queue).toString());
        bw.close();
    }

    public static StringBuilder calculator(Deque<Integer> queueStack, Queue<Integer> queue) {
        StringBuilder sb = new StringBuilder();

        while (!queue.isEmpty()) {
            queueStack.addFirst(queue.poll());

            sb.append(queueStack.pollLast()).append(" ");
        }

        return sb;
    }
}
