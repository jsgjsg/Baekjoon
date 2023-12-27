import java.util.HashMap;

class Solution {
    
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> hash = new HashMap<>();


        for(int i = 0; i < participant.length; i++) {
            String str = participant[i];

            if(hash.containsKey(str)) hash.replace(str, hash.get(str) + 1);
            else hash.put(str, 1);
        }

        for(int i = 0; i < completion.length; i++) {
            String str = completion[i];
            int get = hash.get(str);
            
            if(get == 1) hash.remove(str);
            else hash.replace(str, get - 1);
        }
        
        for(String s : hash.keySet()) answer = s;
        
        return answer;
    }
}