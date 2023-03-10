package 백준.level1;

/* https://www.acmicpc.net/problem/1000 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1000 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        System.out.println(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
    }
}
