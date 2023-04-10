package 분류별로.queue;

/* https://www.acmicpc.net/problem/1966 */

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int cnt = 1;
            Queue<int[]> queue = new LinkedList<>();

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                queue.add(new int[]{j, Integer.parseInt(st.nextToken())});
            }

            boolean flag = true;
            while (flag){

                int max = 0;
                for (int j = 0; j < queue.size(); j++) {
                    if (queue.peek()[1] > max) {
                        max = queue.peek()[1];
                    }
                    queue.add(queue.poll());
                }

                for (int j = 0; j < queue.size(); j++) {
                    if (max == queue.peek()[1]) {
                        if (M == queue.peek()[0]) {
                            flag = false;
                            break;
                        } else {
                            cnt++;
                            queue.poll();
                            break;
                        }
                    } else {
                        queue.add(queue.poll());
                    }
                }
            }

            sb.append(cnt).append("\n");
        }

        bw.write(sb.toString());
        bw.close();
    }
}
