class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer;
        
        int s = 0;
        int e = query.length - 1;
        for(int i = 0; i < query.length; i++) {
            if(i % 2 == 0) e = s + query[i];
            else s = s + query[i];
        }
        
        answer = new int[e - s + 1];
        for(int i = 0; i <= e - s; i++) {
            answer[i] = arr[s + i];
        }
        
        return answer;
    }
}