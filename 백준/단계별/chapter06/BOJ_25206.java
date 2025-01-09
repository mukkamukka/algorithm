package 단계별.chapter06;

/* https://www.acmicpc.net/problem/25206 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double sum = 0;
        double totalGrade = 0;
        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            double grade = Double.parseDouble(st.nextToken());
            String score = st.nextToken();

            switch (score) {
                case "A+":
                    sum += grade * 4.5;
                    totalGrade += grade;
                    break;
                case "A0":
                    sum += grade * 4.0;
                    totalGrade += grade;
                    break;
                case "B+":
                    sum += grade * 3.5;
                    totalGrade += grade;
                    break;
                case "B0":
                    sum += grade * 3.0;
                    totalGrade += grade;
                    break;
                case "C+":
                    sum += grade * 2.5;
                    totalGrade += grade;
                    break;
                case "C0":
                    sum += grade * 2.0;
                    totalGrade += grade;
                    break;
                case "D+":
                    sum += grade * 1.5;
                    totalGrade += grade;
                    break;
                case "D0":
                    sum += grade;
                    totalGrade += grade;
                    break;
                case "F":
                    totalGrade += grade;
                    break;
                default:
                    break;
            }
        }
        br.close();

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%.6f", sum / totalGrade));
        System.out.print(sb);
    }
}
