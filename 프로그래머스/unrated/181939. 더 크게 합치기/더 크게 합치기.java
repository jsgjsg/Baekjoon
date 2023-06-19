class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        StringBuilder sb = new StringBuilder();
        sb.append(a).append(b);
        int ab = Integer.parseInt(sb.toString());
        sb.setLength(0);
        sb.append(b).append(a);
        int ba = Integer.parseInt(sb.toString());
        
        answer = Math.max(ab, ba);
        
        return answer;
    }
}