package 프로그래머스.hash;

/*https://school.programmers.co.kr/learn/courses/30/lessons/1845*/
/* 폰켓몬 */

import java.util.HashMap;

public class PG_1845 {
    public static void main(String[] args) {
        int[] nums1 = {3, 1, 2, 3};
        int[] nums2 = {3, 3, 3, 2, 2, 4};
        int[] nums3 = {3, 3, 3, 2, 2, 2};

        System.out.println(solution(nums1));
        System.out.println(solution(nums2));
        System.out.print(solution(nums3));
    }

    public static int solution(int[] nums) {
        int selectNum = nums.length / 2;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int num : nums) {
            hm.put(num, 1);
        }

        return Integer.min(selectNum, hm.size());
    }
}
