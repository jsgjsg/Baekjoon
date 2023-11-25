class Solution {
    public long solution(int balls, int share) {
        long answer = 1;
        
        long div = 1;
        for(long i = balls; i > Math.max(balls - share, share); i--) {
            answer *= i;
            div *= balls - i + 1;
            if(answer % div == 0) {
                answer /= div;
                div = 1;
            }
        }
        
        
        return answer / div;
    }
}