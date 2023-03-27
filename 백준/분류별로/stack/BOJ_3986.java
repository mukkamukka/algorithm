package 분류별로.stack;

/* https://www.acmicpc.net/problem/3986 */

import java.io.*;
import java.util.Stack;

public class BOJ_3986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String str;
        int cnt = 0;
        Stack<Character> stack;

        for (int i = 0; i < N; i++) {
            stack = new Stack<>();
            str = br.readLine();

            for (int j = 0; j < str.length(); j++) {
                if (!stack.isEmpty()) {
                    if (stack.peek().equals(str.charAt(j))) {
                        stack.pop();
                    } else {
                        stack.push(str.charAt(j));
                    }
                } else {
                    stack.push(str.charAt(j));
                }
            }

            if (stack.isEmpty()) {
                cnt++;
            }
        }

        bw.write(String.valueOf(cnt));
        bw.close();
    }
}
