package 분류별로.hash;

/* https://www.acmicpc.net/problem/20291 */

import java.io.*;
import java.util.*;

public class BOJ_20291 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            String[] arr = str.split("\\.");

            hashMap.put(arr[1], hashMap.getOrDefault(arr[1], 0) + 1);
        }

        ArrayList<String> arrayList = new ArrayList<>();
        int i = 0;
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            arrayList.add(entry.getKey() + " " + entry.getValue());
            i++;
        }

        Collections.sort(arrayList);

        for (String str : arrayList) {
            sb.append(str).append("\n");
        }

        bw.write(sb.toString());
        bw.close();
    }
}
