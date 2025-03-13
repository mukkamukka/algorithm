package 분류별.priorityQueue;

/* https://www.acmicpc.net/problem/11000 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ_11000 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int[][] rooms = new int[n][2];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            rooms[i][0] = Integer.parseInt(st.nextToken());
            rooms[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(rooms, Comparator.comparingInt(a -> a[0])); //시작 시간 기준으로 정렬
        PriorityQueue<Integer> roomEndTime = new PriorityQueue<>();
        for (int[] room : rooms) {
            if (!roomEndTime.isEmpty() && roomEndTime.peek() <= room[0]) {
                roomEndTime.poll();
            }

            roomEndTime.add(room[1]);
        }

        System.out.print(roomEndTime.size());
    }
}
