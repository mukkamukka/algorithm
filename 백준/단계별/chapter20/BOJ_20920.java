package 단계별.chapter20;

/* https://www.acmicpc.net/problem/20920 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_20920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> wordMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String word = br.readLine();

            if (word.length() >= m) {
                wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
            }
        }

        List<Map.Entry<String, Integer>> wordList = new ArrayList<>(wordMap.entrySet());

        wordList.sort((s1, s2) -> {
            if (s1.getValue() == s2.getValue()) {
                if (s1.getKey().length() == s2.getKey().length()) {
                    return s1.getKey().compareTo(s2.getKey());
                } else {
                    return s2.getKey().length() - s1.getKey().length();
                }
            } else {
                return s2.getValue() - s1.getValue();
            }
        });

        for (Map.Entry<String, Integer> entry : wordList) {
            sb.append(entry.getKey()).append("\n");
        }

        System.out.print(sb);
    }
}
