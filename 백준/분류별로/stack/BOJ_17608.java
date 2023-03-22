package 분류별로.stack;

/* https://www.acmicpc.net/problem/17608 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_17608 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        int h;
        int max = 0;
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            h = Integer.parseInt(br.readLine());
            stack.push(h);
        }
        while (!stack.isEmpty()) {
            if (stack.peek() > max) {
                max = stack.pop();
                cnt++;
            } else {
                stack.pop();
            }
        }

        System.out.println(cnt);
    }
}
