package queue;

/* 프로세스 */
/* https://school.programmers.co.kr/learn/courses/30/lessons/42587 */

import java.util.LinkedList;
import java.util.Queue;

public class BOJ_42587 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        int[] priorities1 = {2, 1, 3, 2};
        int[] priorities2 = {1, 1, 9, 1, 1, 1};

        sb.append(solution(priorities1, 2)).append("\n");
        sb.append(solution(priorities2, 0));

        System.out.print(sb);
    }

    public static int solution(int[] priorities, int location) {
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> queueLocation = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.add(priorities[i]);
            queueLocation.add(i);
        }

        int answer = 0;
        while (true) {
            int max = getMax(queue);
            int maxLocation = 0;

            for (int i = 0; i < queue.size(); i++) {
                if (queue.peek() == max) {
                    answer++;
                    queue.poll();
                    maxLocation = queueLocation.poll();
                    break;
                }

                queue.add(queue.poll());
                queueLocation.add(queueLocation.poll());
            }

            if (maxLocation == location) {
                break;
            }
        }

        return answer;
    }

    public static int getMax(Queue<Integer> queue) {
        int max = Integer.MIN_VALUE;
        int length = queue.size();

        for (int i = 0; i < length; i++) {
            if (max < queue.peek()) {
                max = queue.peek();
            }

            queue.add(queue.poll());
        }

        return max;
    }
}
