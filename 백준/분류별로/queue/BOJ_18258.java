package 분류별로.queue;

/* https://www.acmicpc.net/problem/18258 */

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        String cmd;
        int backNum = 0;
        boolean flag;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            cmd = st.nextToken();
            flag = true;

            if (cmd.equals("push")) {
                backNum = Integer.parseInt(st.nextToken());
                queue.add(backNum);
            } else if (cmd.equals("pop")) {
                if (!queue.isEmpty()) {
                    sb.append(queue.poll()).append("\n");
                    continue;
                }
                flag = false;
            } else if (cmd.equals("size")) {
                sb.append(queue.size()).append("\n");
            } else if (cmd.equals("empty")) {
                if (queue.isEmpty()) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else if (cmd.equals("front")) {
                if (!queue.isEmpty()) {
                    sb.append(queue.peek()).append("\n");
                    continue;
                }
                flag = false;
            } else if (cmd.equals("back")) {
                if (!queue.isEmpty()) {
                    sb.append(backNum).append("\n");
                    continue;
                }
                flag = false;
            }

            if (!flag) {
                sb.append(-1).append("\n");
            }
        }

        bw.write(sb.toString());
        bw.close();
    }
}
