package 분류별로.queue;

/* https://www.acmicpc.net/problem/14713 */

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_14713 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int cntToken;
        int cntTokenSum = 0;

        Queue<Queue<String>> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            cntToken = st.countTokens();
            cntTokenSum += cntToken;
            Queue<String> inside = new LinkedList<>();

            for (int j = 0; j < cntToken; j++) {
                inside.add(st.nextToken());
            }
            queue.add(inside);
        }

        st = new StringTokenizer(br.readLine());
        int cntLToken = st.countTokens();

        if (cntTokenSum != cntLToken) {
            sb.append("Impossible");
        } else {
            Queue<String> L = new LinkedList<>();

            for (int i = 0; i < cntLToken; i++) {
                L.add(st.nextToken());
            }

            boolean flag = true;
            for (int i = 0; i < cntLToken; i++) {
                String confirmStr = L.poll();
                flag = true;

                for (int j = 0; j < queue.size(); j++) {
                    if (confirmStr.equals(queue.peek().peek())) {
                        queue.peek().poll();
                        flag = false;
                        break;
                    } else {
                        queue.add(queue.poll());
                    }
                }
                if (flag) {
                    sb.append("Impossible");
                    break;
                }
            }

            if (!flag) {
                sb.append("Possible");
            }
        }


        bw.write(sb.toString());
        bw.close();
    }
}
