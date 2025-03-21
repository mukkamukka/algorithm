package 단계별.chapter12;

/* https://www.acmicpc.net/problem/1018 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] board = new char[n][m];
        
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            
            for (int j = 0; j < m; j++) {
                board[i][j] = str.charAt(j);        
            }
        }
        
        int minCnt = Integer.MAX_VALUE;

        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                int cntB = 0; //왼쪽 위가 B인 경우 다시 칠해야 하는 정사각형 개수
                int cntW = 0; //왼쪽 위가 W인 경우 다시 칠해야 하는 정사각형 개수

                for (int x = 0; x < 8; x++) {
                    for (int y = 0; y < 8; y++) {
                        char current = board[x + i][y + j];
                        if ((x + y) % 2 == 0) {
                            if (current != 'B') cntB++;
                            if (current != 'W') cntW++;
                        } else {
                            if (current != 'W') cntB++;
                            if (current != 'B') cntW++;
                        }
                    }
                }
                minCnt = Math.min(minCnt, Math.min(cntB, cntW));
            }
        }

        System.out.print(minCnt);
    }
}
