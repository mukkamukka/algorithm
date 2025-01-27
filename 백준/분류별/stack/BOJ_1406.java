package 분류별.stack;

/* https://www.acmicpc.net/problem/1406 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        Stack<String> cursorLeft = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            cursorLeft.push(String.valueOf(str.charAt(i)));
        }

        int m = Integer.parseInt(br.readLine());
        Stack<String> cursorRight = new Stack<>();
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "L":
                    if (!cursorLeft.isEmpty()) cursorRight.push(cursorLeft.pop());
                    break;
                case "D":
                    if (!cursorRight.isEmpty()) cursorLeft.push(cursorRight.pop());
                    break;
                case "B":
                    if (!cursorLeft.isEmpty()) cursorLeft.pop();
                    break;
                case "P":
                    cursorLeft.push(st.nextToken());
                    break;
            }
        }
        br.close();

        StringBuilder sb = new StringBuilder();
        for (String s : cursorLeft) {
            sb.append(s);
        }
        int num = cursorRight.size();
        for (int i = 0; i < num; i++) {
            sb.append(cursorRight.pop());
        }
        System.out.print(sb);
    }
}
