import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int count = 0;
        
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < progresses.length; i++) {
            queue.add(i);
        }
        
        int day = 0;
        ArrayList<Integer> answerList = new ArrayList<> ();
        while(!queue.isEmpty()) {
            int idx = queue.remove();
            int progress = progresses[idx] + speeds[idx] * day;
            if(progress >= 100) {
                count++;
                continue;
            }
            
            if(count != 0) answerList.add(count);
            count = 0;
            
            while(progress < 100) {
                progress += speeds[idx];
                day++;
            }
            count++;
        }
        
        answerList.add(count);
        
        answer = new int[answerList.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}