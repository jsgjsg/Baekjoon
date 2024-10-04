import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        int len = 0;
        
        StringTokenizer st = new StringTokenizer(s, "{}");
        int[] count = new int[100001];
        while(st.hasMoreTokens()) {
            String cur = st.nextToken();
            if(cur.equals(",")) continue;
            
            StringTokenizer comma = new StringTokenizer(cur, ",");
            while(comma.hasMoreTokens()) {
                count[Integer.parseInt(comma.nextToken())]++;
            }
            len++;
        }
        
        answer = new int[len];
        for(int i = 1; i <= 100000; i++) {
            if(count[i] == 0) continue;
            
            answer[len - count[i]] = i;
        }
        
        return answer;
    }
}