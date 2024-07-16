import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int len = score.length;
        int[] answer = new int[len];
        int idx = 0;
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < len; i++) {
            list.add(score[i]);
            list.sort((a, b) -> Integer.compare(a, b));
            if(list.size() > k) list.remove(0);
            
            answer[idx++] = list.get(0);
        }
        
        return answer;
    }
}