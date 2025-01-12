package 단계별.chapter08;

/* https://www.acmicpc.net/problem/2903 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        double num = Math.pow(2, n) + 1; //한변의 점 개수 = 한변에 있는 사각형의 개수 + 1
        int result = (int)Math.pow(num, 2); //한변의 점 개수 * 한변의 점 개수 = 전체 점의 개수

        StringBuilder sb = new StringBuilder();
        sb.append(result);
        System.out.print(sb);
    }
}
