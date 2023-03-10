package 백준.level1;

/* https://www.acmicpc.net/problem/11382 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11382 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Long sum = Long.parseLong(st.nextToken()) + Long.parseLong(st.nextToken()) + Long.parseLong(st.nextToken());

        System.out.println(sum);
    }
}
