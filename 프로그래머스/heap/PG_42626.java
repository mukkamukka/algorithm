package heap;

/* 더 맵게 */
/* https://school.programmers.co.kr/learn/courses/30/lessons/42626 */

import java.util.PriorityQueue;

public class PG_42626 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        int[] scoville = {1, 2, 3, 9, 10, 12};

        sb.append(solution(scoville, 7));

        System.out.print(sb);
    }

    public static int solution(int[] scoville, int K) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int num : scoville) {
            heap.add(num);
        }

        int answer = 0;
        while (K > heap.peek()) {
            if (heap.size() < 2) {
                return -1;
            }
            heap.add(heap.poll() + heap.poll() * 2);
            answer++;

        }

        return answer;
    }
}
