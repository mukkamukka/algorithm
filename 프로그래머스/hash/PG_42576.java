package hash;

/* 완주하지 못한 선수 */
/* https://school.programmers.co.kr/learn/courses/30/lessons/42576 */

import java.util.HashMap;
import java.util.Map;

public class PG_42576 {
    public static void main(String[] args) {
        String[] participant1 = {"leo", "kiki", "eden"};
        String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] participant3 = {"mislav", "stanko", "mislav", "ana"};
        String[] completion1 = {"eden", "kiki"};
        String[] completion2 = {"josipa", "filipa", "marina", "nikola"};
        String[] completion3 = {"stanko", "ana", "mislav"};

        StringBuilder sb = new StringBuilder();
        sb.append(solution(participant1, completion1)).append("\n");
        sb.append(solution(participant2, completion2)).append("\n");
        sb.append(solution(participant3, completion3));
        System.out.print(sb);
    }

    public static String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> hm = new HashMap<>();
        for (String s : participant) {
            hm.put(s, hm.getOrDefault(s, 0) + 1);
        }

        for (String s : completion) {
            hm.put(s, hm.getOrDefault(s, 0) - 1);
        }

        String answer = " ";
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == 1) {
                answer =  entry.getKey();
                break;
            }
        }

        return answer;
    }
}
