class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        my_string = my_string.replaceAll("[a-z]|[A-Z]", "");
        
        for(int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            
            answer += c - '0';
        }
        
        return answer;
    }
}