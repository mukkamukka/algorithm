package 단계별.chapter10;

/* https://www.acmicpc.net/problem/10101 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10101 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        br.close();

        StringBuilder sb = new StringBuilder();
        if (a + b + c != 180) {
            sb.append("Error");
        } else {
            if (a == b && b == c) {
                sb.append("Equilateral");
            } else if (a != b && b != c && a != c) {
                sb.append("Scalene");
            } else {
                sb.append("Isosceles");
            }
        }
        System.out.print(sb);
    }
}
