package 분류별.stack;

/* https://www.acmicpc.net/problem/28278 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());

            switch (command) {
                case 1:
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    if (stack.isEmpty()) {
                        sb.append(-1);
                    } else {
                        sb.append(stack.pop());
                    }
                    break;
                case 3:
                    sb.append(stack.size());
                    break;
                case 4:
                    if (stack.isEmpty()) {
                        sb.append(1);
                    } else {
                        sb.append(0);
                    }
                    break;
                case 5:
                    if (stack.isEmpty()) {
                        sb.append(-1);
                    } else {
                        sb.append(stack.peek());
                    }
                    break;
            }

            if (command != 1) {
                sb.append("\n");
            }
        }
        br.close();

        System.out.print(sb);
    }
}
