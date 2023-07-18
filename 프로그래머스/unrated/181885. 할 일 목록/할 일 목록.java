import java.util.*;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer;
        
        ArrayList<String> arr = new ArrayList<String>();
        for(int i = 0; i < todo_list.length; i++) {
            if(!finished[i]) arr.add(todo_list[i]);
        }
        
        answer = new String[arr.size()];
        for(int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        
        return answer;
    }
}