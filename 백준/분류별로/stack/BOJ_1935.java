package 분류별로.stack;

/* https://www.acmicpc.net/problem/1935 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_1935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        Stack<Double> stack = new Stack<>();

        Double[] arr = new Double[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Double.parseDouble(br.readLine());
        }

        double num = 0;
        double popNum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > ')' && str.charAt(i) < '0') {
                num = stack.pop();
                popNum = stack.pop();

                if (str.charAt(i) == '+') {
                    stack.push(num + popNum);
                } else if (str.charAt(i) == '-') {
                    stack.push(popNum - num);
                } else if (str.charAt(i) == '*') {
                    stack.push(num * popNum);
                } else {
                    stack.push(popNum / num);
                }
            } else {
                stack.push(arr[str.charAt(i) - 65]);
            }
        }

        System.out.println(String.format("%.2f", stack.pop()));
    }
}
