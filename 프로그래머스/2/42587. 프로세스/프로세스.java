import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        int[] priorSort = Arrays.copyOf(priorities, priorities.length);
        Arrays.sort(priorSort);
        
        int idx = 0;
        int len = priorities.length;
        while(true) {
            if(priorities[idx] == priorSort[len - answer - 1]) {
                answer++;
                if(idx == location) break;
            }
            
            idx = (idx + 1) % len;
        }
        
        return answer;
    }
}