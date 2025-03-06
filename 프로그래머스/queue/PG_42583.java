package queue;

/* 다리를 지나는 트럭 */
/* https://school.programmers.co.kr/learn/courses/30/lessons/42583 */

import java.util.LinkedList;
import java.util.Queue;

public class PG_42583 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        int[] truckWeights1 = {7, 4, 5, 6};
        int[] truckWeights2 = {10};
        int[] truckWeights3 = {10,10,10,10,10,10,10,10,10,10};

        sb.append(solution(2, 10, truckWeights1)).append("\n");
        sb.append(solution(100, 100, truckWeights2)).append("\n");
        sb.append(solution(100, 100, truckWeights3));

        System.out.print(sb);
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> trucks = new LinkedList<>();
        Queue<int[]> bridge = new LinkedList<>();

        for (int truckWeight : truck_weights) {
            trucks.add(truckWeight);
        }

        int answer = 0;
        int bridgeWeight = 0;
        while (!trucks.isEmpty() || !bridge.isEmpty()) {
            answer++;

            if (!bridge.isEmpty()) {
                for (int i = 0; i < bridge.size(); i++) {
                    bridge.peek()[1]++;
                    bridge.add(bridge.poll());
                }

                if (bridge.peek()[1] > bridge_length) {
                    bridgeWeight -= bridge.poll()[0];
                }
            }

            if (!trucks.isEmpty()) {
                if (weight >= bridgeWeight + trucks.peek()) {
                    int truckWeight = trucks.poll();
                    bridgeWeight += truckWeight;
                    bridge.add(new int[]{truckWeight, 1});
                }
            }
        }

        return answer;
    }
}
