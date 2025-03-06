package hash;

/* 베스트앨범 */
/* https://school.programmers.co.kr/learn/courses/30/lessons/42579 */

import java.util.*;

public class PG_42579 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};

        sb.append(solution(genres, plays));
        System.out.print(sb);
    }

    public static Queue<Integer> solution(String[] genres, int[] plays) {
        Queue<Integer> answer = new LinkedList<>();
        HashMap<String, Integer> totalPlayMap = new HashMap<>();

        for(int i = 0; i < genres.length; i++) {
            totalPlayMap.put(genres[i], totalPlayMap.getOrDefault(genres[i], 0) + plays[i]);
        }

        List<String> genreList = new ArrayList<>(totalPlayMap.keySet());
        genreList.sort((o1, o2) -> totalPlayMap.get(o2).compareTo(totalPlayMap.get(o1))); //hm의 value값을 기준으로 keyset을 내림차순 정렬. 즉, 각 장르별 총 플레이 횟수를 기준으로 장르들을 내림차순 정렬

        for (String str : genreList) { //총 플레이 횟수가 높은 장르부터 answer에 index 추가
            HashMap<Integer, Integer> playMap = new HashMap<>();

            for (int i = 0; i < genres.length; i++) {
                if (genres[i].equals(str)) { //같은 장르만 index 값을 key, play 횟수를 value로 map에 저장
                    playMap.put(i, plays[i]);
                }
            }

            List<Integer> indexList = new ArrayList<>(playMap.keySet());
            indexList.sort((o1, o2) -> playMap.get(o2).compareTo(playMap.get(o1))); //플레이 횟수를 기준으로 index 값들을 내림차순 정렬

            for (int i = 0; i < Math.min(2, indexList.size()); i++) {
                answer.add(indexList.get(i));
            }
        }

        return answer;
    }
}
