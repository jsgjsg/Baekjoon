class Solution {
    public int solution(int[] array, int n) {
        int answer = 100;
        int min = 100;
        
        for(int i = 0; i < array.length; i++) {
            int dis = Math.abs(array[i] - n);
            if(dis < min) {
                min = dis;
                answer = array[i];
            }
            if(dis == min && array[i] < answer) answer = array[i];
        }
        
        return answer;
    }
}