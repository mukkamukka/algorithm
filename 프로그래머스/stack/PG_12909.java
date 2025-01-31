package stack;

/* 올바른 괄호 */
/* https://school.programmers.co.kr/learn/courses/30/lessons/12909 */
import java.util.Stack;

public class PG_12909 {
    public static void main(String[] args) {
        String s1 = "()()";
        String s2 = "(())()";
        String s3 = ")()(";
        String s4 = "(()(";

        StringBuilder sb = new StringBuilder();
        sb.append(solution(s1)).append("\n");
        sb.append(solution(s2)).append("\n");
        sb.append(solution(s3)).append("\n");
        sb.append(solution(s4));
        System.out.print(sb);
    }

    public static boolean solution(String s) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty() && s.charAt(i) == ')') {
                return false;
            }

            if (s.charAt(i) == '(') {
                stack.push("(");
            } else {
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
