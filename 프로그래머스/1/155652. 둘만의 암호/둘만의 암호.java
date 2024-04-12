class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        boolean[] skipArr = new boolean[26];
        for(int i = 0; i < skip.length(); i++) {
            skipArr[skip.charAt(i)-'a'] = true;
        }
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for(int j = 0; j < index;) {
                c += 1;
                if(c > 'z') c -= 26;
                
                if(!skipArr[c - 'a']) j++;
            }
            answer += c;
        }
        
        return answer;
    }
}