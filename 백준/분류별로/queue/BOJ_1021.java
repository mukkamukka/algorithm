package 분류별로.queue;

/* https://www.acmicpc.net/problem/1021 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        LinkedList<Integer> deque = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            deque.add(i + 1);
        }

        int cnt = 0;
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < m; i++) {
            queue.add(Integer.parseInt(st2.nextToken()));
        }

        for (int i = 0; i < m; i++) {
            int num = queue.poll();
            int middle = n / 2;
            int location = deque.indexOf(num);

            if (location <= middle) {
                cnt += middleDown(deque, num);
            } else {
                cnt += middleUp(deque, num);
            }
            n--;
        }

        System.out.println(cnt);
    }

    static int middleDown(Deque<Integer> deque, int num) {
        int cnt = 0;

        while (true) {
            if (deque.peekFirst() == num) {
                deque.pollFirst();
                return cnt;
            }
            cnt++;
            deque.addLast(deque.pollFirst());
        }
    }

    static int middleUp(Deque<Integer> deque, int num) {
        int cnt = 0;

        while (true) {
            if (deque.peekFirst() == num) {
                deque.pollFirst();
                return cnt;
            }
            cnt++;
            deque.addFirst(deque.pollLast());
        }
    }
}
