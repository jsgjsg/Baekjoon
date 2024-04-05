import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
        for(int i = 0; i < players.length; i++) {
            hashmap.put(players[i], i);
        }
        
        for(int i = 0; i < callings.length; i++) {
            int callidx = hashmap.get(callings[i]);
            
            hashmap.put(callings[i], callidx - 1);
            hashmap.put(players[callidx - 1], callidx);
            
            players[callidx] = players[callidx - 1];
            players[callidx - 1] = callings[i];
        }
        
        return players;
    }
}