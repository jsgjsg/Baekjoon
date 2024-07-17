class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        StringBuilder sb;
        for(int i = 0; i < n; i++) {
            sb = new StringBuilder();
            int res = arr1[i] | arr2[i];
            for(int j = 0; j < n; j++) {
                if(res % 2 == 0) sb.append(" ");
                else sb.append("#");
                
                res /= 2;
            }
            answer[i] = sb.reverse().toString();
        }
        
        return answer;
    }
}