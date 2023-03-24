package 분류별로.stack;

/* https://www.acmicpc.net/problem/23253 */

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_23253 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int k, popNum;
        boolean flag = true;
        Stack<Integer> stack;

        loop:
        for (int i = 0; i < M; i++) {
            k = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            stack = new Stack<>();

            for (int j = 0; j < k; j++) {
                stack.push(Integer.parseInt(st.nextToken()));
            }

            while (stack.size() > 1) {
                popNum = stack.pop();
                if (popNum > stack.peek()) {
                    flag = false;
                    break loop;
                }
            }
        }

        if (flag) {
            sb.append("Yes");
        } else {
            sb.append("No");
        }

        bw.write(sb.toString());
        bw.close();
    }
}
