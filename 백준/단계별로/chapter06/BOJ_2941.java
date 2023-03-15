package 단계별로.chapter06;

/* https://www.acmicpc.net/problem/2941 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int cnt = 0;
        int num;

        for (int i = 0; i < str.length(); i++){
            num = i + 1;
            if (str.charAt(i) == 'c'){
                if (num < str.length()){
                    if (str.charAt(num) == '='){
                        i++;
                    } else if (str.charAt(num) == '-'){
                        i++;
                    }
                }
            } else if (str.charAt(i) == 'd'){
                if (i + 1 < str.length()){
                    if (str.charAt(num) == 'z'){
                        if(i + 2 < str.length()){
                            if (str.charAt(num + 1) != '=') {
                            } else {
                                i += 2;
                            }
                        }
                    } else if (str.charAt(num) == '-'){
                        i++;
                    }
                }
            } else if (str.charAt(i) == 'l' || str.charAt(i) == 'n'){
                if (i + 1 < str.length()){
                    if (str.charAt(num) == 'j'){
                        i++;
                    }
                }
            } else if (str.charAt(i) == 's' || str.charAt(i) == 'z'){
                if (i + 1 < str.length()){
                    if (str.charAt(num) == '='){
                        i++;
                    }
                }
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}

