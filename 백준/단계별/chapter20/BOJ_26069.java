package 단계별.chapter20;

/* https://www.acmicpc.net/problem/26069 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BOJ_26069 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        HashSet<String> danceMember = new HashSet<>();
        danceMember.add("ChongChong");

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String member1 = st.nextToken();
            String member2 = st.nextToken();

            if (danceMember.contains(member1)) {
                danceMember.add(member2);
            } else if (danceMember.contains(member2)) {
                danceMember.add(member1);
            }
        }

        System.out.print(danceMember.size());
    }

}
