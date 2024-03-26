package 단계별로.chapter08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int point = 2;
        int result = 0;

        for (int i = 0; i < N; i++) {
            point += point - 1;

            result = point * point;
        }

        System.out.println(result);
    }
}
