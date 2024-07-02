class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        
        int[] countX = new int[10];
        int[] countY = new int[10];
        int[] count = new int[10];
        
        for(int i = 0; i < X.length(); i++) {
            int n = X.charAt(i) - '0';
            countX[n]++;
        }
        for(int i = 0; i < Y.length(); i++) {
            int n = Y.charAt(i) - '0';
            countY[n]++;
        }
        for(int i = 0; i < 10; i++) {
            count[i] = Math.min(countX[i], countY[i]);
        }
        for(int i = 9; i > 0; i--) {
            answer += Integer.toString(i).repeat(count[i]);
        }
        
        if(answer.equals("")) return count[0] == 0 ? "-1" : "0";
        else answer += "0".repeat(count[0]);
        
        return answer;
    }
}