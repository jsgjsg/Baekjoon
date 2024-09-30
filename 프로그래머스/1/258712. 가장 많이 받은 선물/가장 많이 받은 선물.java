import java.util.*;
class Solution {
    public int solution(String[] friends, String[] gifts) {
        int len = friends.length;
        
        HashMap<String, Integer> map = new HashMap<> ();
        
        for(int i = 0; i < len; i++) {
            map.put(friends[i], i);
        }
        
        int[][] giftAtoB = new int[len][len];
        int[] score = new int[len];
        
        // 각 사람 당 선물지수 => 준 선물 개수 - 받은 선물 개수
        // 둘이 주고받은 선물 개수 비교
        for(int i = 0; i < gifts.length; i++) {
            StringTokenizer st = new StringTokenizer(gifts[i]);
            int from = map.get(st.nextToken());
            int to = map.get(st.nextToken());
            
            giftAtoB[from][to]++;
            score[from]++;
            score[to]--;
        }
        
        int[] answer = new int[len];
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < i; j++) {
                if(giftAtoB[i][j] > giftAtoB[j][i]) answer[i]++;
                else if(giftAtoB[i][j] < giftAtoB[j][i]) answer[j]++;
                else {
                    if(score[i] > score[j]) answer[i]++;
                    else if(score[i] < score[j]) answer[j]++;
                }
            }
        }
        Arrays.sort(answer);
        
        return answer[len - 1];
    }
}