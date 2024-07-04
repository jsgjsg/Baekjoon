import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] suit = new int[n + 1];
        Arrays.fill(suit, 1);
        suit[0] = -1;
        
        for(int studentNum : lost) {
            suit[studentNum]--;
        }
        for(int studentNum : reserve) {
            suit[studentNum]++;
        }
        
        for(int i = 1; i < n; i++) {
            if((suit[i] == 0 && suit[i + 1] == 2) || (suit[i] == 2 && suit[i + 1] == 0)) {
                suit[i] = 1;
                suit[i + 1] = 1;
            }
        }
        
        answer = Arrays.stream(suit).reduce(0, (res, cur) -> {
            return cur >= 1 ? res + 1 : res;
        });
        
        return answer;
    }
}