package 단계별로.chapter08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N.length(); i++) {
            if (N.charAt(i) >= 'A' && N.charAt(i) <= 'Z') {
                stack.push(N.charAt(i) - 55);
            } else {
                stack.push(N.charAt(i) - 48);
            }
        }

        int result = 0;

        for (int i = 0; i < N.length(); i++) {
            result += (int) (stack.pop() * Math.pow(B, i));
        }

        System.out.println(result);
    }
}
