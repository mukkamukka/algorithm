package 단계별로.chapter08;

/* https://www.acmicpc.net/problem/5086 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            int firstNum = Integer.parseInt(st.nextToken());
            int secondNum = Integer.parseInt(st.nextToken());

            if (firstNum == 0 && secondNum == 0) {
                break;
            }

            if (firstNum > secondNum) {
                if (firstNum % secondNum == 0) {
                    sb.append("multiple");
                } else {
                    sb.append("neither");
                }
            } else if (firstNum < secondNum) {
                if (secondNum % firstNum == 0) {
                    sb.append("factor");
                } else {
                    sb.append("neither");
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
