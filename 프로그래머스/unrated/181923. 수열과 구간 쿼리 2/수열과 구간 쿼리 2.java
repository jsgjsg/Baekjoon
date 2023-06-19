class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            int ans = 1_000_001;
            for(int j = s; j <= e; j++) {
                if(arr[j] > k) ans = Math.min(ans, arr[j]);
            }
            answer[i] = (ans == 1_000_001) ? -1 : ans;
        }
        
        return answer;
    }
}