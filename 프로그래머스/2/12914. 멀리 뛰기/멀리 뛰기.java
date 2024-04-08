class Solution {
    public int solution(int n) {
        int answer = 2;
        
        int pre = 1;
        int tmp = 2;
        
        if(n == 1) return 1;
        if(n == 2) return 2;
        
        for(int i = 3; i <= n; i++) {
            tmp = answer;
            answer = (answer + pre) % 1234567;
            pre = tmp;
        }
        
        return answer;
    }
}