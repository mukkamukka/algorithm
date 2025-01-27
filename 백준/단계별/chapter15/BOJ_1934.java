package 단계별.chapter15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int multi = 1;

            int num = 2;
            int num2 = Math.min(a, b);
            for (int j = 2; j <= num2; j++) {
                if (a % num == 0 && (b % num) == 0) {
                    multi *= num;
                    a /= num;
                    b /= num;
                } else {
                    num++;
                }
            }
            sb.append(multi * a * b).append("\n");
        }
        br.close();

        System.out.print(sb);
    }
}
