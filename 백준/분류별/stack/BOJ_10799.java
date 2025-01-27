package 분류별.stack;

/* https://www.acmicpc.net/problem/10799 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String stick = br.readLine();
        br.close();

        Stack<Integer> stack = new Stack<>();
        int cnt = 0;
        for (int i = 0; i < stick.length(); i++) {
            if (stick.charAt(i) == '(') {
                if (stick.charAt(i + 1) != ')') {
                    stack.push(1);
                }
            } else {
                if (stick.charAt(i - 1) == '(') {
                    cnt += stack.size();
                } else {
                    cnt++;
                    stack.pop();
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(cnt);
        System.out.print(sb);
    }
}
