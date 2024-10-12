class Solution {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        
        target(numbers, 0, 0, target);
        
        return answer;
    }
    
    public void target(int[] numbers, int idx, int cal, int target) {
        if(idx == numbers.length) {
            if(target == cal) answer++; 
            return;
        }
        
        target(numbers, idx + 1, cal + numbers[idx], target);
        target(numbers, idx + 1, cal - numbers[idx], target);
        
    }
}