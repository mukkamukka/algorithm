package queue;

/*https://school.programmers.co.kr/learn/courses/30/lessons/42583*/
/* 트럭 */

import java.util.LinkedList;
import java.util.Queue;

public class PG_42583 {
    public static void main(String[] args) {
        int bridge_length1 = 2;
        int weight1 = 10;
        int[] truck_weights1 = {7, 4, 5, 6};
        int bridge_length2 = 100;
        int weight2 = 100;
        int[] truck_weights2 = {10};
        int bridge_length3 = 100;
        int weight3 = 100;
        int[] truck_weights3 = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};

        System.out.println(solution(bridge_length1, weight1, truck_weights1));
        System.out.println(solution(bridge_length2, weight2, truck_weights2));
        System.out.println(solution(bridge_length3, weight3, truck_weights3));
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int weightChk = weight;
        int truck = 0;
        int leftTruckCnt = 0;
        Queue<Integer> waitTruck = new LinkedList<>();
        Queue<int[]> onBridgeTruck = new LinkedList<>();

        for (int truckWeight : truck_weights) {
            waitTruck.add(truckWeight);
        }

        while (leftTruckCnt != truck_weights.length) {
            answer++;

            if (!onBridgeTruck.isEmpty()) {
                for (int i = 0; i < onBridgeTruck.size(); i++) {
                    if (onBridgeTruck.peek()[0] == bridge_length) {
                        int[] arr = onBridgeTruck.poll();
                        leftTruckCnt++;
                        weightChk += arr[1];
                    }

                    if (!onBridgeTruck.isEmpty()) {
                        int[] arr = onBridgeTruck.poll();
                        arr[0] += 1;
                        onBridgeTruck.add(arr);
                    }
                }
            }

            if (!waitTruck.isEmpty() && weightChk >= waitTruck.peek()) {
                truck = waitTruck.poll();
                onBridgeTruck.add(new int[]{1, truck});
                weightChk -= truck;
            }
        }

        return answer;
    }
}
