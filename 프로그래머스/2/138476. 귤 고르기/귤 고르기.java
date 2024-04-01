import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int countLen = 10000001;
        
        int[] count = new int[countLen];
        int index = 0;
        
        for(int i = 0; i < tangerine.length; i++) {
            if(count[tangerine[i]] == 0) index++;
            count[tangerine[i]]++;
        }
        Arrays.sort(count);
        
        for(int i = countLen - 1; i >= countLen - index; i--) {
            if(k <= 0) break;
            k -= count[i];
            answer++;
        }
        return answer;
    }
}