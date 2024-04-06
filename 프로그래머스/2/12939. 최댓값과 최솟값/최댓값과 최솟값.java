import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        StringTokenizer st = new StringTokenizer(s);
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        while(st.hasMoreTokens()) {
            int n = Integer.parseInt(st.nextToken());
            
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append(min).append(" ").append(max);
        answer = sb.toString();
        
        return answer;
    }
}