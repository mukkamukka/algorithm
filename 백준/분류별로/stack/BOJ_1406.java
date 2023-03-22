package 분류별로.stack;

/* https://www.acmicpc.net/problem/1406 */

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String str = br.readLine();
        Stack<Character> cursorLeft = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            cursorLeft.push(str.charAt(i));
        }

        int N = Integer.parseInt(br.readLine());
        String cmd;
        Stack<Character> cursorRight = new Stack<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            cmd = st.nextToken();

            if (cmd.equals("L")) {
                if (!cursorLeft.isEmpty()) {
                    cursorRight.push(cursorLeft.pop());
                }
            } else if (cmd.equals("D")) {
                if (!cursorRight.isEmpty()) {
                    cursorLeft.push(cursorRight.pop());
                }
            } else if (cmd.equals("B")) {
                if (!cursorLeft.isEmpty()) {
                    cursorLeft.pop();
                }
            } else if (cmd.equals("P")) {
                cursorLeft.push(st.nextToken().charAt(0));
            }
        }

        while (!cursorRight.isEmpty()) {
            cursorLeft.push(cursorRight.pop());
        }

        for (char i : cursorLeft) {
            bw.write(i);
        }

        bw.close();
    }
}

