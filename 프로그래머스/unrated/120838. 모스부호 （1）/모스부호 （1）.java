import java.io.*;
import java.util.*;

class Solution {
    public String solution(String letter) {
        String answer = "";
        StringTokenizer st = new StringTokenizer(letter);
        StringBuilder sb = new StringBuilder();
        
        String[] morse = new String[] {
                ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
                "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
                "..-","...-",".--","-..-","-.--","--.."
        };
        
        while(st.hasMoreTokens()) {
            String s = st.nextToken();
            for(int i = 0; i < 26; i++) {
                if(s.equals(morse[i])) {
                    sb.append((char)(i + 'a'));
                }
            }
        }
        
        answer = sb.toString();
        return answer;
    }
}