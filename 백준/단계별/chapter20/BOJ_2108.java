package 단계별.chapter20;

/* https://www.acmicpc.net/problem/2108 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];
        Map<Integer, Integer> freqMap = new HashMap<>();
        int sum = 0;
        int maxFreq = 0;

        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(br.readLine());
            sum += array[i];
            freqMap.put(array[i], freqMap.getOrDefault(array[i], 0) + 1);
            maxFreq = Math.max(maxFreq, freqMap.get(array[i]));
        }

        Arrays.sort(array);

        List<Integer> modeList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == maxFreq) {
                modeList.add(entry.getKey());
            }
        }
        Collections.sort(modeList);
        int mode = (modeList.size() > 1) ? modeList.get(1) : modeList.get(0);

        sb.append(Math.round((double) sum / n)).append("\n");
        sb.append(array[n / 2]).append("\n");
        sb.append(mode).append("\n");
        sb.append(array[n - 1] - array[0]);

        System.out.print(sb);
    }
}
