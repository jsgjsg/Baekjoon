class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        
        while(!my_string.equals("")) {
            sb.append(my_string.charAt(0));
            my_string = my_string.replaceAll(my_string.substring(0, 1), "");
        }
        answer = sb.toString();
        
        return answer;
    }
}