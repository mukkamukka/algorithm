package 분류별로.stack;

/* https://www.acmicpc.net/problem/4949 */

import java.io.*;
import java.util.Stack;

public class BOJ_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String str;
        Stack<Character> stack;
        boolean flag;

        while (true) {
            str = br.readLine();

            if (str.equals(".")) {
                break;
            }

            stack = new Stack<>();
            flag = false;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(' || str.charAt(i) == '[') {
                    stack.push(str.charAt(i));
                }  else if (str.charAt(i) == ')') {
                    if (stack.isEmpty()) {
                        flag = true;
                        break;
                    }
                    if (stack.peek() != '(') {
                        flag = true;
                        break;
                    }
                    stack.pop();
                } else if (str.charAt(i) == ']') {
                    if (stack.isEmpty()) {
                        flag = true;
                        break;
                    }
                    if (stack.peek() != '[') {
                        flag = true;
                        break;
                    }
                    stack.pop();
                }
            }

            if (flag) {
                sb.append("no\n");
                continue;
            }

            if (stack.isEmpty()) {
                sb.append("yes\n");
            } else {
                sb.append("no\n");
            }
        }

        bw.write(sb.toString());
        bw.close();
    }
}
