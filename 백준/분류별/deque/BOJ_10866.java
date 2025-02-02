package 분류별.deque;

/* https://www.acmicpc.net/problem/10866 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ_10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push_front":
                    deque.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    deque.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    if (deque.isEmpty()) sb.append(-1);
                    else sb.append(deque.pollFirst());
                    break;
                case "pop_back":
                    if (deque.isEmpty()) sb.append(-1);
                    else sb.append(deque.pollLast());
                    break;
                case "size":
                    sb.append(deque.size());
                    break;
                case "empty":
                    if (deque.isEmpty()) sb.append(1);
                    else sb.append(0);
                    break;
                case "front":
                    if (deque.isEmpty()) sb.append(-1);
                    else sb.append(deque.peekFirst());
                    break;
                case "back":
                    if (deque.isEmpty()) sb.append(-1);
                    else sb.append(deque.peekLast());
                    break;
            }

            if (!command.equals("push_front") && !command.equals("push_back")) {
                sb.append("\n");
            }
        }
        br.close();

        System.out.print(sb);
    }
}
