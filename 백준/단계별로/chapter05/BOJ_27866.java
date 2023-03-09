package 단계별로.chapter05;

/* https://www.acmicpc.net/problem/27866 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Character[] arr = new Character[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }

        int num = Integer.parseInt(br.readLine());

        System.out.println(arr[num - 1]);
    }
}
