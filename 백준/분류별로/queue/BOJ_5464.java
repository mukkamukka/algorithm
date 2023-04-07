package 분류별로.queue;

/* https://www.acmicpc.net/problem/5464 */

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_5464 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] rs = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            rs[i] = Integer.parseInt(br.readLine());
        }

        int[] wk = new int[M + 1];
        for (int i = 1; i <= M; i++) {
            wk[i] = Integer.parseInt(br.readLine());
        }

        int parkingPriceSum = 0;
        boolean[] flag = new boolean[N + 1];
        ArrayList<Integer> arrayList = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N + 1; i++) {
            arrayList.add(0);
        }

        for (int i = 0; i < M * 2; i++) {
            int num = Integer.parseInt(br.readLine());

            if (!queue.isEmpty()) {
                for (int j = 1; j <= N; j++) {
                    if (!flag[j]) {
                        int savedNum = queue.poll();
                        int parkingPrice = rs[j] * wk[savedNum];
                        parkingPriceSum += parkingPrice;
                        arrayList.set(j, savedNum);
                        flag[j] = true;
                        break;
                    }
                }
            }

            loop:
            if (num > 0) {
                for (int j = 1; j <= N; j++) {
                    if (!flag[j]) {
                        int parkingPrice = rs[j] * wk[num];
                        parkingPriceSum += parkingPrice;
                        arrayList.set(j, num);
                        flag[j] = true;
                        break loop;
                    }
                }
                queue.add(num);

            } else {
                flag[arrayList.indexOf(Math.abs(num))] = false;
            }
        }

        sb.append(parkingPriceSum);

        bw.write(sb.toString());
        bw.close();
    }
}
