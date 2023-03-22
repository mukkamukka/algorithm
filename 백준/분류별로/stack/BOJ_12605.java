package 분류별로.stack;

/* https://www.acmicpc.net/problem/12605 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_12605 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb;
        int N = Integer.parseInt(br.readLine());
        Stack<String> stack;
        int num;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            sb = new StringBuilder();
            stack = new Stack<>();
            num = st.countTokens();

            for (int j = 0; j < num; j++) {
                stack.push(st.nextToken());
            }

            sb.append("Case #").append(i + 1).append(": ");
            while (!stack.isEmpty()) {
                sb.append(stack.pop()).append(" ");
            }
            System.out.println(sb);
        }
    }
}
