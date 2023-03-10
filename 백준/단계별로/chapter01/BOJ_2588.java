package 백준.level1;

/* https://www.acmicpc.net/problem/2588 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        System.out.println(a * (b % 10));
        System.out.println(a * ((b % 100) / 10));
        System.out.println(a * (b / 100));
        System.out.println(a * b);
    }
}
