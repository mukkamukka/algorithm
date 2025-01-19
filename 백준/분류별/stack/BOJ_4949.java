package 분류별.stack;

/* https://www.acmicpc.net/problem/4949 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        while (true) {
            String str = br.readLine();
            if (str.equals(".")) {
                break;
            }

            boolean flag = true;
            Stack<String> stack = new Stack<>();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(') {
                    stack.push("(");
                } else if (str.charAt(i) == '[') {
                    stack.push("[");
                } else if (str.charAt(i) == ')') {
                    if (stack.isEmpty() || !stack.peek().equals("(")) {
                        sb.append("no").append("\n");
                        flag = false;
                        break;
                    }
                    stack.pop();
                } else if (str.charAt(i) == ']') {
                    if (stack.isEmpty() || !stack.peek().equals("[")) {
                        sb.append("no").append("\n");
                        flag = false;
                        break;
                    }
                    stack.pop();
                }
            }

            if (!flag) {
                continue;
            }
            if (stack.isEmpty()) {
                sb.append("yes");
            } else {
                sb.append("no");
            }
            sb.append("\n");
        }
        br.close();

        System.out.print(sb);
    }
}
