class Solution {
    public int solution(int n) {
        int answer = 1;
        
        while(n > answer) {
            n /= ++answer;
        }
        
        return answer;
    }
}