package 단계별.chapter21;

/* https://www.acmicpc.net/problem/4779 */

import java.io.*;

public class BOJ_4779 {
    static int n;
    static StringBuilder answer;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String str;
        while ((str = br.readLine()) != null && !str.trim().isEmpty()) {
            n = Integer.parseInt(str);
            answer = new StringBuilder();
            int length = (int) Math.pow(3, n);

            for (int i = 0; i < length; i++) {
                answer.append("-");
            }

            recursion(0, length);
            sb.append(answer).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    public static void recursion(int start,int size) {
        if (size == 1) {
            return;
        }

        int newSize = size / 3;

        for (int i = start + newSize; i < start + 2 * newSize; i++) {
            answer.setCharAt(i, ' ');
        }

        recursion(start, newSize);
        recursion(start + 2 * newSize, newSize);
    }
}
