package 분류별로.hash;

/* https://www.acmicpc.net/problem/16165 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_16165 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, ArrayList<String>> hashMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String groupName = br.readLine();
            int totalMember = Integer.parseInt(br.readLine());
            ArrayList<String> member = new ArrayList<>();

            for (int j = 0; j < totalMember; j++) {
                member.add(br.readLine());
            }

            hashMap.put(groupName, member);
        }

        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            int num = Integer.parseInt(br.readLine());

            if (num == 1) {
                sb.append(getGroup(str, hashMap)).append("\n");
            } else if (num == 0) {
                ArrayList<String> memberList = hashMap.get(str);
                getMember(sb, memberList);
            }
        }

        System.out.println(sb);
    }

    static StringBuilder getMember(StringBuilder sb, ArrayList<String> memberList) {
        Collections.sort(memberList);
        for (String member : memberList) {
            sb.append(member).append("\n");
        }
        return sb;
    }

    static String getGroup(String str, HashMap<String, ArrayList<String>> hashMap) {
        for (Map.Entry<String, ArrayList<String>> entry : hashMap.entrySet()) {
            ArrayList<String> memberList = entry.getValue();
            if (memberList.contains(str)) {
                return entry.getKey();
            }
        }

        return "";
    }
}
