class Solution {
    public int solution(String s) {
        int answer = 0;
        
        int cntX = 0;
        int cntOther = 0;
        char cur = ' ';
        for(int i = 0; i < s.length(); i++) {
            if(cur == ' ') cur = s.charAt(i);
            
            if(cur == s.charAt(i)) cntX++;
            else cntOther++;
            
            if(cntX == cntOther) {
                answer++;
                cur = ' ';
                cntX = 0;
                cntOther = 0;
            }
        }
        if(cntX != cntOther) answer++;
        
        return answer;
    }
}