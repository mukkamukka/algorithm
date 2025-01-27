package 분류별.stack;

/* https://www.acmicpc.net/problem/2493 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_2493 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        Stack<int[]> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int[] top = {Integer.parseInt(st.nextToken()), i + 1};

            while (!stack.isEmpty()) {
                if (stack.peek()[0] > top[0]) {
                    sb.append(stack.peek()[1]);
                    stack.push(top);
                    break;
                } else {
                    stack.pop();
                }
            }

            if (stack.isEmpty()) {
                sb.append(0);
                stack.push(top);
            }

            sb.append(" ");
        }

        System.out.print(sb);
    }
}
