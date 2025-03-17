package 분류별.greedy;

/* https://www.acmicpc.net/problem/1931 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ_1931 {
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

        Arrays.sort(rooms, Comparator.comparingInt((int[] a) -> a[1]).thenComparingInt(a -> a[0])); //끝나는 시간 기준으로 정렬, 끝나는 시간이 같으면 시작 시간 기준으로 정렬

        int cnt = 0;
        int meetingEndTime = 0;
        for (int[] room : rooms) {
            if (room[0] >= meetingEndTime) {
                cnt++;
                meetingEndTime = room[1];
            }
        }

        System.out.print(cnt);
    }
}
