package 분류별.greedy;

/* https://www.acmicpc.net/problem/16953 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_16953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());

        int cnt = 1;
        while (b != a) {
            if (b < a) {
                cnt = -1;
                break;
            }
            if (b % 2 == 0) {
                b /= 2;
            } else if (b % 10 == 1) {
                b /= 10;
            } else {
                cnt = -1;
                break;
            }
            cnt++;
        }

        System.out.print(cnt);
    }
}
