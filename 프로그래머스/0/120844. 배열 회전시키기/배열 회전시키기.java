class Solution {
    public int[] solution(int[] numbers, String direction) {
        int len = numbers.length;
        
        int[] answer = new int[len];
        
        int move = direction.equals("right") ? 1 : -1;
        
        for(int i = 0; i < len; i++) {
            answer[(i + move + len) % len] = numbers[i];
        }
        
        return answer;
    }
}