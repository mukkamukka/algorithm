package queue;

/*https://school.programmers.co.kr/learn/courses/30/lessons/42584*/
/* 주식가격 */

import java.util.LinkedList;
import java.util.Queue;

public class PG_42584 {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};

        System.out.print(solution(prices));
    }

    public static Queue<Integer> solution(int[] prices) {
        Queue<Integer> answer = new LinkedList<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int price : prices) {
            queue.add(price);
        }

        while (!queue.isEmpty()) {
            int peekPrice = queue.poll();
            int cnt = 0;

            for (int otherPrice : queue) {
                cnt++;

                if (peekPrice > otherPrice) {
                    break;
                }
            }

            answer.add(cnt);
        }

        return answer;
    }
}
