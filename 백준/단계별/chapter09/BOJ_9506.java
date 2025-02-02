package 단계별.chapter09;

/* https://www.acmicpc.net/problem/9506 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) {
                break;
            }

            Queue<Integer> queue = new LinkedList<>();
            int sum = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    queue.add(i);
                    sum += i;
                }
            }

            if (sum == n) {
                sb.append(n).append(" = ");

                int num = queue.size();
                for (int i = 0; i < num; i++) {
                    int factor = queue.poll();
                    sb.append(factor);
                    if (i != num - 1) {
                        sb.append(" + ");
                    }
                }
            } else {
                sb.append(n).append(" is NOT perfect.");
            }
            sb.append("\n");
        }
        br.close();
        System.out.print(sb);
    }
}
