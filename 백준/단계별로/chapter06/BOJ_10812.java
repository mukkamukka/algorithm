package 단계별로.chapter06;

/* https://www.acmicpc.net/problem/10812 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10812 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int a, b, c;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            if (a == c) {
                continue;
            }
            int[] arrBehind = new int[b - c + 1];
            int[] arrForward = new int[c - a];
            int k = 0;

            for (int j = c; j <= b; j++) {
                arrBehind[k] = arr[j - 1];
                k++;
            }
            k=0;
            for (int j = a; j < c; j++) {
                arrForward[k] = arr[j - 1];
                k++;
            }
            k=0;
            for (int j = a + arrBehind.length; j < arrBehind.length + c; j++) {
                arr[j - 1] = arrForward[k];
                k++;
            }
            k=0;
            for (int j = a; j < arrBehind.length + a; j++) {
                arr[j - 1] = arrBehind[k];
                k++;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}

