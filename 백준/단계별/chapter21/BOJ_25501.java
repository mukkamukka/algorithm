package 단계별.chapter21;

/* https://www.acmicpc.net/problem/25501 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_25501 {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int[] arr = isPalindrome(br.readLine());
            sb.append(arr[0]).append(" ").append(arr[1]).append("\n");
        }

        System.out.print(sb);
    }

    public static int[] isPalindrome(String s){
        return recursion(s, 0, s.length() - 1 , 1);
    }

    public static int[] recursion(String s, int l, int r, int cnt) {
        if (l >= r) return new int[]{1, cnt};
        else if (s.charAt(l) != s.charAt(r)) return new int[]{0, cnt};
        else return recursion(s, l + 1, r - 1, ++cnt);

    }
}
