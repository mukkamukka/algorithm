package 분류별.greedy;

/* https://www.acmicpc.net/problem/1789 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long s = Long.parseLong(br.readLine());
        long sum = 0;
        long num = 1;

        while (sum <= s) {
            sum += num;
            num++;
        }

        System.out.print(num - 2);
    }
}
