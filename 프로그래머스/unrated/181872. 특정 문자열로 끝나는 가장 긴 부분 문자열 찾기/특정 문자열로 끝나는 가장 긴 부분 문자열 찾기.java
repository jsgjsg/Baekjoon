class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        
        int index = pat.length() - 1;
        for(int i = myString.length() - 1; i >= 0; i--) {
            if(myString.charAt(i) == pat.charAt(index)) index--;
            else index = pat.length() - 1;
            
            if(index == -1) return myString.substring(0, i + pat.length());
        }
        
        return answer;
    }
}