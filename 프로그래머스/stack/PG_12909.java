package 프로그래머스.stack;

/*https://school.programmers.co.kr/learn/courses/30/lessons/12909*/
/* 올바른 괄호 */

import java.util.Stack;

public class PG_12909 {
    public static void main(String[] args) {
        String s1 = "()()";
        String s2 = "(())()";
        String s3 = ")()(";
        String s4 = "(()(";

        System.out.println(solution(s1));
        System.out.println(solution(s2));
        System.out.println(solution(s3));
        System.out.println(solution(s4));
    }
    public static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (stack.empty() && s.charAt(i) == ')') {
                return false;
            }

            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else {
                stack.pop();
            }
        }

        return stack.empty();
    }
}
