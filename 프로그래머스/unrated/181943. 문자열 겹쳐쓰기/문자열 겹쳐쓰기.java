class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < my_string.length(); i++) {
            if(i < s || i >= s + overwrite_string.length())
                sb.append(my_string.charAt(i));
            
            else sb.append(overwrite_string.charAt(i - s));
        }
        answer = sb.toString();
        
        return answer;
    }
}