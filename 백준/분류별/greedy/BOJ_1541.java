package 분류별.greedy;

/* https://www.acmicpc.net/problem/1541 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] nums = str.split("(?=[-+])");
        int sum = Integer.parseInt(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i].startsWith("+")) {
                sum += Integer.parseInt(nums[i].substring(1));
            } else if (nums[i].startsWith("-")) {
                for (int j = i; j < nums.length; j++) {
                    sum -= Integer.parseInt(nums[j].substring(1));
                }
                break;
            }
        }

        System.out.print(sum);
    }
}
