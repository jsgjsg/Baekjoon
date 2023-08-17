class Solution {
    public String solution(String myString) {
        String answer = myString.toLowerCase();
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < answer.length(); i++) {
            char c = answer.charAt(i);
            if(c == 'a') c = 'A';
            
            sb.append(c);
        }
        answer = sb.toString();
        
        return answer;
    }
}