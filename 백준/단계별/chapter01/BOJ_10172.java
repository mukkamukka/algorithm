package 단계별.chapter01;

/* https://www.acmicpc.net/problem/10172 */

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BOJ_10172 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("|\\_/|" + "\n");
        bw.write("|q p|   /}" + "\n");
        bw.write("( 0 )\"\"\"\\" + "\n");
        bw.write("|\"^\"`    |" + "\n");
        bw.write("||_/=\\\\__|");
        bw.flush();
        bw.close();
    }
}

