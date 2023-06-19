class Solution {
    public String solution(String code) {
        String answer = "";
        
        boolean mode = false;
        StringBuilder ret = new StringBuilder();
        for(int i = 0; i < code.length(); i++) {
            if(code.charAt(i) == '1') {
                mode = !mode;
                continue;
            }
            if(!mode && i % 2 == 0) ret.append(code.charAt(i));
            if(mode && i % 2 == 1) ret.append(code.charAt(i));
        }
        answer = ret.length() == 0 ? "EMPTY" : ret.toString();
        
        return answer;
    }
}