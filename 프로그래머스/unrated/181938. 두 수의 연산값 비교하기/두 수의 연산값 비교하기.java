class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int ab = Integer.parseInt(""+ a + b);
        if(ab >= 2 * a * b) answer = ab;
        else answer = 2 * a * b;
        
        return answer;
    }
}