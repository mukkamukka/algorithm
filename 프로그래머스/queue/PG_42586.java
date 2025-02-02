package queue;

/* 기능 개발 */
/* https://school.programmers.co.kr/learn/courses/30/lessons/42586 */

import java.util.LinkedList;
import java.util.Queue;

public class PG_42586 {
    public static void main(String[] args) {
        int[] progresses1 = {93, 30, 55};
        int[] progresses2 = {95, 90, 99, 99, 80, 99};
        int[] speeds1 = {1, 30, 5};
        int[] speeds2 = {1, 1, 1, 1, 1, 1};

        StringBuilder sb = new StringBuilder();
        sb.append(solution(progresses1, speeds1)).append("\n");
        sb.append(solution(progresses2, speeds2));
        System.out.print(sb);
    }


    public static Queue<Integer> solution(int[] progresses, int[] speeds) {
        int[] arr = new int[progresses.length];
        for (int i = 0; i < progresses.length; i++) {
            arr[i] = (int)Math.ceil((100 - progresses[i]) /(double) speeds[i]);
        }

        Queue<Integer> answer = new LinkedList<>();
        int beforeNum = arr[0];
        int cnt = 1;
        for (int i = 1; i < arr.length; i++) {
            if (beforeNum >= arr[i]) {
                cnt++;
            } else {
                answer.add(cnt);
                cnt = 1;
                beforeNum = arr[i];
            }
        }
        answer.add(cnt);

        return answer;
    }
}
