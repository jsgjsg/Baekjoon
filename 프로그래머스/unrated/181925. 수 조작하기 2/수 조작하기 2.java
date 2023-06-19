class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < numLog.length; i++) {
            int res = numLog[i] - numLog[i - 1];
            
            if(res == 1) sb.append("w");
            if(res == -1) sb.append("s");
            if(res == 10) sb.append("d");
            if(res == -10) sb.append("a");
        }
        answer = sb.toString();
        
        return answer;
    }
}