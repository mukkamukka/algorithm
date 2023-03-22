package 분류별로.stack;

/* https://www.acmicpc.net/problem/17952 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_17952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int firstNum;
        int totalScore = 0;
        int timeNum;
        Stack<Integer> scoreStack = new Stack<>();
        Stack<Integer> timeStack = new Stack<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            firstNum = Integer.parseInt(st.nextToken());

            if (firstNum == 0) {
                if (!timeStack.isEmpty()) {
                    timeStack.push(timeStack.pop() - 1);

                    if (timeStack.peek() == 0) {
                        timeStack.pop();
                        totalScore += scoreStack.pop();
                    }
                }
                continue;
            }

            scoreStack.push(Integer.parseInt(st.nextToken()));
            timeNum = Integer.parseInt(st.nextToken()) - 1;

            if (timeNum == 0) {
                totalScore += scoreStack.pop();
                continue;
            }

            timeStack.push(timeNum);
        }

        System.out.println(totalScore);
    }
}
