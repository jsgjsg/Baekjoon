class Solution {
    public int solution(String myString, String pat) {
        
        int patIndex = 0;
        for(int i = 0; i < myString.length(); i++) {
            int C, c;
            C = c = pat.charAt(patIndex);
            if(C >= 'a' && C <= 'z') C = C - 'a' + 'A';
            if(c >= 'A' && c <= 'Z') c = c - 'A' + 'a';
            
            if(myString.charAt(i) == C || myString.charAt(i) == c) patIndex++;
            else patIndex = 0;
            
            if(pat.length() == patIndex) return 1;
        }
        
        return 0;
    }
}