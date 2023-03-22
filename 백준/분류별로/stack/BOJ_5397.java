package 분류별로.stack;

/* https://www.acmicpc.net/problem/5397 */

import java.io.*;
import java.util.Stack;

public class BOJ_5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        String str;
        Stack<Character> stack;
        Stack<Character> savedStack;

        for (int i = 0; i < T; i++) {
            str = br.readLine();
            stack = new Stack<>();
            savedStack = new Stack<>();

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '<') {
                    if (!stack.isEmpty()) {
                        savedStack.push(stack.pop());
                    }
                } else if (str.charAt(j) == '>') {
                    if (!savedStack.isEmpty()) {
                        stack.push(savedStack.pop());
                    }
                } else if (str.charAt(j) == '-') {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                } else {
                    stack.push(str.charAt(j));
                }
            }

            while (!savedStack.isEmpty()) {
                stack.push(savedStack.pop());
            }

            for (char j : stack) {
                bw.write(j);
            }
            bw.write("\n");
        }

        bw.close();
    }
}
