package queue;

/* 주식가격 */
/* https://school.programmers.co.kr/learn/courses/30/lessons/42584 */

import java.util.LinkedList;
import java.util.Queue;

public class PG_42584 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        int[] prices = {1, 2, 3, 2, 3};

        sb.append(solution(prices));

        System.out.print(sb);
    }

    public static Queue<Integer> solution(int[] prices) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < prices.length; i++) {
            int cnt = 0;
            for (int j = i + 1; j < prices.length; j++) {
                cnt++;
                if (prices[i] > prices[j]) {
                    break;
                }
            }
            queue.add(cnt);
        }

        return queue;
    }
}
