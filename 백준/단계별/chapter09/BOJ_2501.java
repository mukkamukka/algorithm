package 단계별.chapter09;

/* https://www.acmicpc.net/problem/2501 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        br.close();

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                queue.add(i);
            }
        }

        for (int i = 1; i < k; i++) {
            queue.poll();
        }

        StringBuilder sb = new StringBuilder();
        int result = 0;
        if (queue.peek() != null) {
            result = queue.peek();
        }
        sb.append(result);
        System.out.print(sb);
    }
}
