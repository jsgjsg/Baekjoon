import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        int[] answer;
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = l; i <= r; i++) {
            int num = i;
            boolean tf = true;
            while(num != 0) {
                if(num % 5 != 0) {
                    tf = false;
                    break;
                }
                num /= 10;
            }
            if(tf) list.add(i);
        }
        
        int len = list.size();
        
        if(len == 0) {
            return new int[] {-1};
        }
        
        answer = new int[len];
        for(int i = 0; i < len; i++) answer[i] = list.get(i);
        
        return answer;
    }
}