package 분류별.stack;

/* https://www.acmicpc.net/problem/10773 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                stack.pop();
            } else {
                stack.push(num);
            }
        }
        br.close();

        int sum = 0;
        for (int i : stack) {
            sum += i;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(sum);
        System.out.print(sb);
    }
}
