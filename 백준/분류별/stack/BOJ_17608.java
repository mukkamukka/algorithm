package 분류별.stack;

/* https://www.acmicpc.net/problem/17608 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_17608 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            stack.push(Integer.parseInt(br.readLine()));
        }
        br.close();

        int maxStick = stack.pop();
        int cnt = 1;
        while (!stack.isEmpty()) {
            if (maxStick < stack.peek()) {
                maxStick = stack.pop();
                cnt++;
            } else {
                stack.pop();
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(cnt);
        System.out.print(sb);
    }
}
