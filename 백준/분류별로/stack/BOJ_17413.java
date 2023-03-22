package 분류별로.stack;

/* https://www.acmicpc.net/problem/17413 */

import java.io.*;
import java.util.Stack;

public class BOJ_17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        Stack<Character> stack = new Stack<>();
        boolean flag = true;

        for (int i = 0; i < str.length(); i++) {
            if (flag) {
                if (str.charAt(i) == '<') {
                    flag = false;
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                } else if (str.charAt(i) == ' ') {
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                } else {
                    stack.push(str.charAt(i));
                    continue;
                }
            } else {
                if (str.charAt(i) == '>') {
                    flag = true;
                }
            }
            sb.append(str.charAt(i));

        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        bw.write(sb.toString());
        bw.close();
    }
}
