class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        
        for(int n : num_list)  {
            if(n % 2 == 1) odd.append(n);
            else even.append(n);
        }
        answer = Integer.parseInt(odd.toString()) + Integer.parseInt(even.toString());
        
        return answer;
    }
}