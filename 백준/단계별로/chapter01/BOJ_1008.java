package 단계별로.chapter01;

/* https://www.acmicpc.net/problem/1008 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1008 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        System.out.println(Double.parseDouble(st.nextToken()) / Double.parseDouble(st.nextToken()));
    }
}
