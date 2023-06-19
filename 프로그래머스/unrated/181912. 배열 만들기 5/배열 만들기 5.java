import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer;
        
        List<Integer> list = new ArrayList();
        for(String str : intStrs) {
            StringBuilder sb = new StringBuilder();
            for(int i = s; i < s + l; i++) sb.append(str.charAt(i));
            
            int res = Integer.parseInt(sb.toString());
            if(res > k) list.add(res);
        }
        
        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) answer[i] = list.get(i);
        
        return answer;
    }
}