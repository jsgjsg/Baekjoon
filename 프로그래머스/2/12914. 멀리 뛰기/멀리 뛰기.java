class Solution {
    public long solution(int n) {
        long answer = 0;
        
        int n1 = 1;
        int n2 = 2;
        
        if(n == 1) return 1;
        if(n == 2) return 2;
        
        for(int i = 3; i <= n; i++) {
            answer = (n1 + n2) % 1234567;
            
            if(i % 2 == 1) n1 += n2;
            else n2 += n1;
            
            n1 %= 1234567;
            n2 %= 1234567;
        }
        
        return answer;
    }
}