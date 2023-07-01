package queue;

/*https://school.programmers.co.kr/learn/courses/30/lessons/42586*/
/* 기능개발 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PG_42586 {
    public static void main(String[] args) {
        int[] progresses1 = {93, 30, 55};
        int[] speeds1 = {1, 30, 5};
        int[] progresses2 = {95, 90, 99, 99, 80, 99};
        int[] speeds2 = {1, 1, 1, 1, 1, 1};

        System.out.println(solution(progresses1, speeds1));
        System.out.print(solution(progresses2, speeds2));
    }

    public static List<Integer> solution(int[] progresses, int[] speeds) { Queue<Double> queue = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            queue.add(Math.ceil((double) (100 - progresses[i]) / speeds[i]));
        }

        int cnt = 1;
        double max = queue.poll();
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < progresses.length - 1; i++) {
            double num = queue.poll();
            if (max >= num) {
                cnt++;
            } else {
                answer.add(cnt);
                cnt = 1;
                max = num;
            }
        }
        answer.add(cnt);

        return answer;
    }
}
