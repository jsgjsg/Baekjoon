import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int s : scoville) {
            pq.offer(s);
        }
        
        if(pq.size() == 0) return -1;
        
        while(pq.size() > 1) {
            int a = pq.poll();
            int b = pq.poll();
            
            if(a >= K) return answer;
            
            pq.offer(a + b * 2);
            answer++;
        }
        
        if(pq.poll() < K) answer = -1;
        
        return answer;
    }
}