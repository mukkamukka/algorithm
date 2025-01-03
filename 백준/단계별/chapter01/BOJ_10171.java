package 단계별.chapter01;

/* https://www.acmicpc.net/problem/10171 */

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BOJ_10171 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("\\    /\\" + "\n");
        bw.write(" )  ( ')" + "\n");
        bw.write("(  /  )" + "\n");
        bw.write(" \\(__)|");
        bw.flush();
        bw.close();
    }
}
