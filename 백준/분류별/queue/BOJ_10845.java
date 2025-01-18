package 분류별.queue;

/* https://www.acmicpc.net/problem/10845 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            switch (command) {
                case "push":
                    queue.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if (queue.isEmpty()) {
                        sb.append(-1);
                    } else {
                        sb.append(queue.poll());
                    }
                    break;
                case "size":
                    sb.append(queue.size());
                    break;
                case "empty":
                    if (queue.isEmpty()) {
                        sb.append(1);
                    } else {
                        sb.append(0);
                    }
                    break;
                case "front":
                    if (queue.isEmpty()) {
                        sb.append(-1);
                    } else {
                        sb.append(queue.peek());
                    }
                    break;
                case "back":
                    if (queue.isEmpty()) {
                        sb.append(-1);
                    } else {
                        for (int j = 1; j <= queue.size(); j ++) {
                            if (j == queue.size()) {
                                sb.append(queue.peek());
                            }
                            queue.add(queue.poll());
                        }
                    }
                    break;
            }
            if (!command.equals("push")) {
                sb.append("\n");
            }
        }
        br.close();
        System.out.print(sb);
    }
}
