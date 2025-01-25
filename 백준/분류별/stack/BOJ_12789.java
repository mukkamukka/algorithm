package 분류별.stack;

/* https://www.acmicpc.net/problem/12789 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.add(Integer.parseInt(st.nextToken()));
        }

        int num = 1;
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty() || !stack.isEmpty()) {
            if (!stack.isEmpty()) {
                if (stack.peek() == num) {
                    stack.pop();
                    num++;
                    continue;
                }
            }

            if (!queue.isEmpty()) {
                if (queue.peek() == num) {
                    queue.poll();
                    num++;
                } else {
                    if (!stack.isEmpty()) {
                        if (queue.peek() > stack.peek()) {
                            break;
                        }
                    }
                    stack.push(queue.poll());
                }
            }
        }

        if (queue.isEmpty() && stack.isEmpty()) {
            sb.append("Nice");
        } else {
            sb.append("Sad");
        }

        System.out.print(sb);
    }
}
