package 분류별로.queue;

/* https://www.acmicpc.net/problem/13335 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_13335 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int length = Integer.parseInt(st.nextToken());
        int weight = Integer.parseInt(st.nextToken());

        Queue<Integer> waitTruck = new LinkedList<>();
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            waitTruck.add(Integer.parseInt(st2.nextToken()));
        }

        int answer = 0;
        int weightChk = weight;
        int truck;
        int leftTruckCnt = 0;
        Queue<int[]> onBridgeTruck = new LinkedList<>();

        while (leftTruckCnt != n) {
            answer++;

            if (!onBridgeTruck.isEmpty()) {
                for (int i = 0; i < onBridgeTruck.size(); i++) {
                    if (onBridgeTruck.peek()[0] == length) {
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

        System.out.print(answer);
    }
}
