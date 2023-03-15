package 단계별로.chapter06;

/* https://www.acmicpc.net/problem/25206 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String trash;
        double score, gradeNum;
        double sum = 0.0;
        double scoreNum= 0.0;
        String grade;

        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine());
            trash = st.nextToken();
            score = Double.parseDouble(st.nextToken());
            grade = st.nextToken();
            gradeNum = 0.0;

            if (grade.charAt(0) == 'A') {
                if (grade.charAt(1) == '+') {
                    gradeNum = 4.5;
                } else {
                    gradeNum = 4.0;
                }
            } else if (grade.charAt(0) == 'B') {
                if (grade.charAt(1) == '+') {
                    gradeNum = 3.5;
                } else {
                    gradeNum = 3.0;
                }
            } else if (grade.charAt(0) == 'C') {
                if (grade.charAt(1) == '+') {
                    gradeNum = 2.5;
                } else {
                    gradeNum = 2.0;
                }
            } else if (grade.charAt(0) == 'D') {
                if (grade.charAt(1) == '+') {
                    gradeNum = 1.5;
                } else {
                    gradeNum = 1.0;
                }
            } else if (grade.charAt(0) == 'F') {
                gradeNum = 0.0;
            } else {
                continue;
            }

            scoreNum += score;
            sum += score * gradeNum;
        }

        String result = String.format("%.6f", (sum / scoreNum));
        System.out.println(result);
    }
}
