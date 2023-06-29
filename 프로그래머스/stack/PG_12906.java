package 프로그래머스.stack;

/*https://school.programmers.co.kr/learn/courses/30/lessons/12906*/
/* 같은 숫자는 싫어 */

import java.util.Stack;

public class PG_12906 {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 3, 3, 0, 1, 1};
        int[] arr2 = {4, 4, 4, 3, 3};

        System.out.println(solution(arr1));
        System.out.print(solution(arr2));
    }

    public static Stack<Integer> solution(int []arr) {
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
