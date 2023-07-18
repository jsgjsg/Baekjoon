class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        while(true) {
            boolean change = false;
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                    change = true;
                }
                else if(arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1;
                    change = true;
                }
            }
            if(change == false) break;
            else answer++;
        }
        
        return answer;
    }
}