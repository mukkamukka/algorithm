package 분류별.stack;

/* https://www.acmicpc.net/problem/12605 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_12605 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Stack<String> stack = new Stack<>();

            int cntToken = st.countTokens();
            for (int j = 0; j < cntToken; j++) {
                stack.push(st.nextToken());
            }

            sb.append("Case #").append(i).append(":");
            int stackSize = stack.size();
            for (int j = 0; j < stackSize; j++) {
                sb.append(" ").append(stack.pop());
            }
            sb.append("\n");
        }
        br.close();

        System.out.print(sb);
    }
}
