package 프로그래머스.hash;

/*https://school.programmers.co.kr/learn/courses/30/lessons/42576*/
/* 완주하지못한선수 */

import java.util.HashMap;

public class PG_42576 {
    public static void main(String[] args) {
        String[] participant1 = {"leo", "kiki", "eden"};
        String[] completion1 = {"eden", "kiki"};
        String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion2 = {"josipa", "filipa", "marina", "nikola"};
        String[] participant3 = {"mislav", "stanko", "mislav", "ana"};
        String[] completion3 = {"stanko", "ana", "mislav"};

        System.out.println("\"" + solution(participant1, completion1) + "\"");
        System.out.println("\"" + solution(participant2, completion2) + "\"");
        System.out.print("\"" + solution(participant3, completion3) + "\"");
    }
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();

        for (String player : participant) {
            hm.put(player, hm.getOrDefault(player, 0) + 1);
        }

        for (String finisher : completion) {
            hm.put(finisher, hm.getOrDefault(finisher, 0) - 1);
        }

        for (String key : hm.keySet() ) {
            if (hm.get(key) != 0) {
                answer = key;
                break;
            }
        }
        return answer;
    }
}
