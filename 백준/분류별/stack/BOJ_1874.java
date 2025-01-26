package 분류별.stack;

/* https://www.acmicpc.net/problem/1874 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.Stack;

public class BOJ_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.add(Integer.parseInt(br.readLine()));
        }
        br.close();

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int num = 1;
        while (!queue.isEmpty()) {
            if (!stack.isEmpty() && Objects.equals(queue.peek(), stack.peek())) {
                stack.pop();
                queue.poll();
                sb.append("-");
            } else if (!stack.isEmpty() && !queue.isEmpty() && queue.peek() < stack.peek()) {
                sb = new StringBuilder();
                sb.append("NO");
                break;
            } else {
                stack.push(num);
                sb.append("+");
                num++;
            }

            sb.append("\n");
        }

        System.out.print(sb);
    }
}
