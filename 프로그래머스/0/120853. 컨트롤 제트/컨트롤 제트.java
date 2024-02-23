import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        
        StringTokenizer st = new StringTokenizer(s);
        int size = st.countTokens();
        String[] arr = new String[size];
        for(int i = 0; i < size; i++) {
            arr[i] = st.nextToken();
        }
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals("Z")) answer -= Integer.parseInt(arr[i - 1]);
            else answer += Integer.parseInt(arr[i]);
        }
        
        return answer;
    }
}