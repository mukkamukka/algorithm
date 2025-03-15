package greedy;

/* 체육복 */
/* https://school.programmers.co.kr/learn/courses/30/lessons/42862 */

import java.util.Arrays;
import java.util.HashSet;

public class PG_42862 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        int[] lost1 = {2, 4};
        int[] lost2 = {2, 4};
        int[] lost3 = {4, 2};
        int[] reserve1 = {1, 3, 5};
        int[] reserve2 = {3};
        int[] reserve3 = {3, 5};

        sb.append(solution(5, lost1, reserve1)).append("\n");
        sb.append(solution(5, lost2, reserve2)).append("\n");
        sb.append(solution(5, lost3, reserve3));

        System.out.print(sb);
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);

        HashSet<Integer> lostSet = new HashSet<>();
        HashSet<Integer> reserveSet = new HashSet<>();

        // 여벌이 있는 학생이 도난당한 경우 먼저 처리
        for (int r : reserve) reserveSet.add(r);
        for (int l : lost) {
            if (reserveSet.contains(l)) {
                reserveSet.remove(l);
            } else {
                lostSet.add(l);
            }
        }

        int answer = n - lostSet.size();

        for (int l : lostSet) {
            if (reserveSet.contains(l - 1)) {
                reserveSet.remove(l - 1);
                answer++;
            } else if (reserveSet.contains(l + 1)) {
                reserveSet.remove(l + 1);
                answer++;
            }
        }

        return answer;
    }
}
