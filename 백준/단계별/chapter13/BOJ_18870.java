package 단계별.chapter13;

/* https://www.acmicpc.net/problem/18870 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] sortedArr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = sortedArr[i]= Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sortedArr);

        Map<Integer, Integer> coordinateMap = new HashMap<>();
        int rank = 0;
        for (int num : sortedArr) {
            if (!coordinateMap.containsKey(num)) {
                coordinateMap.put(num, rank++);
            }
        }

        for (int i : arr) {
            sb.append(coordinateMap.get(i)).append(" ");
        }

        System.out.print(sb);
    }
}
