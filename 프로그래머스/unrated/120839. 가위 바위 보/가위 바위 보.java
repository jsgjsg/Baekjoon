class Solution {
    public String solution(String rsp) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < rsp.length(); i++) {
            if(rsp.charAt(i) == '2') sb.append(0);
            else if(rsp.charAt(i) == '5') sb.append(2);
            else sb.append(5);
        }
        
        answer = sb.toString();
        return answer;
    }
}