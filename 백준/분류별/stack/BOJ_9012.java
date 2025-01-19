package 분류별.stack;

/* https://www.acmicpc.net/problem/9012 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            String ps = br.readLine();
            Stack<Integer> stack = new Stack<>();
            boolean flag = true;
            for (int j = 0; j < ps.length(); j++) {
                if (ps.charAt(j) == '(') {
                    stack.add(1);
                } else if (ps.charAt(j) == ')') {
                    if (stack.isEmpty()) {
                        sb.append("NO").append("\n");
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
                sb.append("YES");
            } else {
                sb.append("NO");
            }
            sb.append("\n");
        }
        br.close();

        System.out.print(sb);
    }
}
