class Solution {
    public int solution(int n) {
        int answer = 0;
        
        boolean[] prime = new boolean[n + 1];
        
        for(int i = 2; i <= n; i++) {
            if(!prime[i]) {
                for(int j = i * 2; j <= n; j += i) {
                    prime[j] = true;
                }
            }
        }
        
        for(int i = 2; i <= n; i++) {
            if(prime[i]) answer++;
        }
        
        return answer;
    }
}