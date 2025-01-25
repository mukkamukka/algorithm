package 분류별.deque;

/* https://www.acmicpc.net/problem/28279 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ_28279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());

            switch (command) {
                case 1:
                    deque.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    deque.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case 3:
                    if (!deque.isEmpty()) sb.append(deque.pollFirst());
                    else sb.append(-1);
                    break;
                case 4:
                    if (!deque.isEmpty()) sb.append(deque.pollLast());
                    else sb.append(-1);
                    break;
                case 5:
                    sb.append(deque.size());
                    break;
                case 6:
                    if (deque.isEmpty()) sb.append(1);
                    else sb.append(0);
                    break;
                case 7:
                    if (!deque.isEmpty()) sb.append(deque.peekFirst());
                    else sb.append(-1);
                    break;
                case 8:
                    if (!deque.isEmpty()) sb.append(deque.peekLast());
                    else sb.append(-1);
                    break;
            }

            if (command != 1 && command != 2) {
                sb.append("\n");
            }
        }
        br.close();

        System.out.print(sb);
    }
}
