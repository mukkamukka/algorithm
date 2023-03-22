package 분류별로.stack;

/* https://www.acmicpc.net/problem/9012*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack;
        int T = Integer.parseInt(br.readLine());
        boolean flag;

        for (int i = 0; i < T; i++) {
            stack = new Stack<>();
            String str = br.readLine();
            flag = true;

            for (int j = 0; j < str.length(); j++) {
                if (stack.isEmpty()) {
                    if (str.charAt(j) == ')') {
                        sb.append("NO").append("\n");
                        flag = false;
                        break;
                    }
                }
                if (str.charAt(j) == ')') {
                    stack.pop();
                } else {
                    stack.push(str.charAt(j));
                }
            }
            if (flag) {
                if (stack.isEmpty()) {
                    sb.append("YES").append("\n");
                } else {
                    sb.append("NO").append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
