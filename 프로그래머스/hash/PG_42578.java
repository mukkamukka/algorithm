package 프로그래머스.hash;

/*https://school.programmers.co.kr/learn/courses/30/lessons/42578*/
/* 의상 */

import java.util.HashMap;

public class PG_42578 {
    public static void main(String[] args) {
        String[][] clothes1 = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        String[][] clothes2 = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};

        System.out.println(solution(clothes1));
        System.out.print(solution(clothes2));
    }

    public static  int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> hm = new HashMap<>();

        for (String[] cloth : clothes) {
            hm.put(cloth[1], hm.getOrDefault(cloth[1], 0) + 1);
        }

        for (int num : hm.values()) {
            answer *= num + 1;
        }

        return answer - 1;
    }
}
