package 단계별.chapter15;

/* https://www.acmicpc.net/problem/1735 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1735 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int numeratorA = Integer.parseInt(st.nextToken());
        int denominatorA = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int numeratorB = Integer.parseInt(st.nextToken());
        int denominatorB = Integer.parseInt(st.nextToken());
        br.close();

        int denominatorResult = denominatorA * denominatorB;
        int numeratorResult = numeratorA * denominatorB + numeratorB * denominatorA;;
        int num = gcd(numeratorResult, denominatorResult);

        sb.append(numeratorResult / num).append(" ").append(denominatorResult / num);
        System.out.print(sb);
    }

    public static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }
}
