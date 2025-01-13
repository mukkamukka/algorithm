package 단계별.chapter08;

/* https://www.acmicpc.net/problem/1193 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        br.close();

        int maxSectorNum = 0;
        int sector = 1;
        //sector는 (1) (2,3) (4,5,6) 이렇게 sector 크기가 +1씩 되게 나뉜다
        while (true) {
            maxSectorNum += sector;
            if (maxSectorNum >= x) {
                break;
            }
            sector++;
        }


        int numerator = sector - (maxSectorNum - x);
        int denominator = (maxSectorNum - x) + 1;
        StringBuilder sb = new StringBuilder();
        if ((sector % 2) == 0) { //섹터가 홀수일때는 분자와 분모 자리 바꾸기
            sb.append(numerator).append("/").append(denominator);
        } else {
            sb.append(denominator).append("/").append(numerator);
        }

        System.out.print(sb);
    }
}
