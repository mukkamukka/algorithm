package 단계별로.chapter05;

/* https://www.acmicpc.net/problem/2908 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String str;
        int num;
        int[] reverseNumArr;
        int[] arr = new int[2];

        for (int i = 0; i < 2; i++) {
            str = st.nextToken();
            reverseNumArr = new int[3];
            num = 0;

            int j = 0;
            for (int k = 2; k >= 0; k--) {
                reverseNumArr[k] = (int)(str.charAt(j)) - 48;
                j++;
            }

            int k = 100;
            for (int l : reverseNumArr) {
                num += k * l;
                k /= 10;
            }

            arr[i] = num;
        }

        if (arr[0] > arr[1]) {
            System.out.println(arr[0]);
        } else {
            System.out.println(arr[1]);
        }


        
    }
}
