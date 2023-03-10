package 단계별로.chapter06;

/* https://www.acmicpc.net/problem/25083*/

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BOJ_25083 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        sb.append("         ,r'\"7").append("\n");
        sb.append("r`-_   ,'  ,/").append("\n");
        sb.append(" \\. \". L_r'").append("\n");
        sb.append("   `~\\/").append("\n");
        sb.append("      |").append("\n");
        sb.append("      |").append("\n");
        bw.write(sb.toString());
        bw.close();
    }
}
