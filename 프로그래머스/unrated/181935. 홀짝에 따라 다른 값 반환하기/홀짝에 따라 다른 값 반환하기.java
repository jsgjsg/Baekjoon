class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(n % 2 == 1) answer = (n + 1) * (n + 1) / 4;
        else answer = n * (n / 2 + 1) * (n + 1) / 3;
        
        return answer;
    }
}