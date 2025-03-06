package hash;

/* 의상 */
/* https://school.programmers.co.kr/learn/courses/30/lessons/42578 */

import java.util.HashMap;
import java.util.Map;

public class PG_42578 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        String[][] clothes1 = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        String[][] clothes2 = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};

        sb.append(solution(clothes1)).append("\n");
        sb.append(solution(clothes2));

        System.out.print(sb);
    }

    public static int solution(String[][] clothes) {
        HashMap<String, Integer> hm = new HashMap<>();

        for (String[] clothe : clothes) {
            hm.put(clothe[1], hm.getOrDefault(clothe[1], 0) + 1);
        }

        int answer = 1;
        for (Map.Entry<String, Integer> map : hm.entrySet()) {
            answer *= map.getValue() + 1;
        }
        return answer - 1;
    }
}
