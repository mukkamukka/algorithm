package stack;

/* 같은 숫자는 싫어 */
/* https://school.programmers.co.kr/learn/courses/30/lessons/12906 */

import java.util.Stack;

public class PG_12906 {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 3, 3, 0, 1, 1};
        int[] arr2 = {4, 4, 4, 3, 3};

        StringBuilder sb = new StringBuilder();
        sb.append(solution(arr1)).append("\n");
        sb.append(solution(arr2));
        System.out.print(sb);
    }

    public static Stack<Integer> solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (stack.peek() != arr[i]) {
                stack.push(arr[i]);
            }
        }

        return stack;
    }
}
