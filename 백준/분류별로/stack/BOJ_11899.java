package 분류별로.stack;

/* https://www.acmicpc.net/problem/11899 */

import java.io.*;
import java.util.Stack;

public class BOJ_11899 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String S = br.readLine();
        Stack<Character> stack = new Stack<>();
        int cnt = 0;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                stack.push(S.charAt(i));
            }
            if (stack.isEmpty()) {
                if (S.charAt(i) == ')') {
                    cnt++;
                }
            } else {
                if (S.charAt(i) == ')') {
                    stack.pop();
                }
            }
        }
        cnt += stack.size();

        bw.write(String.valueOf(cnt));
        bw.close();
    }
}
