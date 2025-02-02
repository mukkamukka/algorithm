package hash;

/* 전화번호 목록 */
/* https://school.programmers.co.kr/learn/courses/30/lessons/42577 */

import java.util.Arrays;
import java.util.HashMap;

public class PG_42577 {
    public static void main(String[] args) {
        String[] phone_book1 = {"119", "97674223", "1195524421"};
        String[] phone_book2 = {"123", "456", "789"};
        String[] phone_book3 = {"12", "123", "1235", "567", "88"};

        StringBuilder sb = new StringBuilder();
        sb.append(solution(phone_book1)).append("\n");
        sb.append(solution(phone_book2)).append("\n");
        sb.append(solution(phone_book3));
        System.out.print(sb);
    }

    public static boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        HashMap<Integer, String> hm = new HashMap<>();
        for (int i = 0; i < phone_book.length; i++) {
            hm.put(i, phone_book[i]);
        }

        boolean answer = true;
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(hm.get(i))) {
                answer = false;
                break;
            }
        }

        return answer;
    }
}
