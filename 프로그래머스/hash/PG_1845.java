package hash;

/* 폰켓몬 */
/* https://school.programmers.co.kr/learn/courses/30/lessons/1845 */

import java.util.HashSet;

public class PG_1845 {
    public static void main(String[] args) {
        int[] nums1 = {3, 1, 2, 3};
        int[] nums2 = {3, 3, 3, 2, 2, 4};
        int[] nums3 = {3, 3, 3, 2, 2, 2};

        StringBuilder sb = new StringBuilder();
        sb.append(solution(nums1)).append("\n");
        sb.append(solution(nums2)).append("\n");
        sb.append(solution(nums3));
        System.out.print(sb);
    }

    public static int solution(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int num : nums) {
            hs.add(num);
        }

        int answer = nums.length / 2;
        if (answer >= hs.size()) {
            answer = hs.size();
        }

        return answer;
    }
}
