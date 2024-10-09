import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String, Integer> hashmap = new HashMap<>();
        
        for(int i = 0; i < clothes.length; i++) {
            String category = clothes[i][1];
            
            if(hashmap.containsKey(category)) hashmap.put(category, (hashmap.get(category) + 1));
            else hashmap.put(category, 1);
        }
        
        for(String cloth : hashmap.keySet()) {
            answer *= (hashmap.get(cloth) + 1);
        }
        answer--;
        
        return answer;
    }
}