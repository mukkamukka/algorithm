package 단계별.chapter20;

/* https://www.acmicpc.net/problem/25192 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BOJ_25192 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> chatMember = new HashSet<>();;

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            String chat = br.readLine();

            if (chat.equals("ENTER")) {
                cnt += chatMember.size();
                chatMember.clear();
            } else {
                chatMember.add(chat);
            }
        }

        System.out.print(cnt + chatMember.size());
    }
}
