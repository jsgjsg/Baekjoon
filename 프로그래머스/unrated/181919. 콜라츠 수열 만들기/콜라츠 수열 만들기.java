import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer;
        
        List<Integer> list = new ArrayList<Integer>();
        
        while(n != 1) {
            list.add(n);
            
            if(n % 2 == 0) n /= 2;
            else n = n * 3 + 1;
        }
        list.add(1);
        
        int len = list.size();
        answer = new int[len];
        for(int i = 0; i < len; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}