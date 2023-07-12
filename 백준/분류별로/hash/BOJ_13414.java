package 분류별로.hash;

/* https://www.acmicpc.net/problem/13414 */

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class BOJ_13414 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < l; i++) {
            String sId = br.readLine();
            hashMap.put(sId, i);
        }

        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Map.Entry<String, Integer>> entries = hashMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toList());

        int i = 0;

        for (Map.Entry<String, Integer> entry : entries) {
            sb.append(entry.getKey());
            i++;
            if (i >= k) {
                break;
            }
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.close();
    }
}
