package 분류별로.queue;

/* https://www.acmicpc.net/problem/12873 */

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class BOJ_12873 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            deque.add(i);
        }

        double i = 1;
        while (deque.size() != 1) {

            double num = Math.pow(i, 3) % deque.size();
            i++;

            if (num == 0) {
                deque.pollLast();
            } else {
                for (int j = 1; j <= num; j++) {
                    if (j == num) {
                        deque.pollFirst();
                    } else {
                        deque.add(deque.poll());
                    }
                }
            }

        }

        sb.append(deque.poll());
        bw.write(sb.toString());
        bw.close();
    }
}
