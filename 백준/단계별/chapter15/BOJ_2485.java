package 단계별.chapter15;

/* https://www.acmicpc.net/problem/2485 */

import java.io.*;

public class BOJ_2485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] trees = new int[n];

        for (int i = 0; i < n; i++) {
             trees[i] = Integer.parseInt(br.readLine());
        }

        int gcdValue = trees[1] - trees[0];
        for (int i = 2; i < n; i++) {
            gcdValue = gcd(gcdValue, trees[i] - trees[i - 1]);
        }

        int totalTrees = (trees[n - 1] - trees[0]) / gcdValue + 1;

        System.out.print(totalTrees - n);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
