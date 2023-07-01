package queue;

/*https://school.programmers.co.kr/learn/courses/30/lessons/42587*/
/* 프로세스 */

import java.util.LinkedList;
import java.util.Queue;

public class PG_42587 {
    public static void main(String[] args) {
        int[] priorities1 = {2, 1, 3, 2};
        int location1 = 2;
        int[] priorities2 = {1, 1, 9, 1, 1, 1};
        int location2 = 0;

        System.out.println(solution(priorities1, location1));
        System.out.print(solution(priorities2, location2));
    }

    public static int solution(int[] priorities, int location) {
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> queueLocation = new LinkedList<>();
        
        for (int i = 0; i < priorities.length; i++) {
            queue.add(priorities[i]);
            queueLocation.add(i);
        }

        int cnt = 0;
        while (true) {
            int max = getMax(queue);
            int maxLocation = 0;

            for (int i = 0; i < queue.size(); i++) {
                if (queue.peek() == max) {
                    cnt++;
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

        return cnt;
    }

    public static int getMax(Queue<Integer> queue) {
        int max = 0;
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
