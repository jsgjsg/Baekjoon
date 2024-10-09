class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] count = new int[3];
        
        for(int i = 0; i < answers.length; i++) {
            int ans = answers[i];
            
            if(ans == p1[i % p1.length]) count[0]++;
            if(ans == p2[i % p2.length]) count[1]++;
            if(ans == p3[i % p3.length]) count[2]++;
        }
        
        int max = Math.max(count[0], Math.max(count[1], count[2]));
        int cnt = 0;
        for(int i = 0; i < 3; i++) if(count[i] == max) cnt++;
        
        answer = new int[cnt];
        int idx = 0;
        for(int i = 0; i < 3; i++) if(count[i] == max) answer[idx++] = i + 1;
        
        return answer;
    }
}