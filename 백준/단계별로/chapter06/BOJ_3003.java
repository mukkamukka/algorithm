package 단계별로.chapter06;

/* https://www.acmicpc.net/problem/25083*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] arr = {1, 1, 2, 2, 2, 8};
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num;

        for (int i = 0; i < 6; i++) {
            num = Integer.parseInt(st.nextToken());
            sb.append(arr[i] - num).append(" ");
        }

        System.out.println(sb);
    }
}
