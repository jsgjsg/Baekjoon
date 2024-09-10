import java.util.*;
class Solution {
    public int solution(int[] order) {        
        Stack<Integer> stack = new Stack<>();
        
        int idx = 0;
        for(int i = 1; i <= order.length * 2; i++) {
            if(idx >= order.length) break;
            
            if(i == order[idx]) idx++;
            else if(!stack.isEmpty() && stack.peek() == order[idx]) {
                idx++;
                stack.pop();
                i--;
            }
            else stack.push(i);
        }
        
        return idx;
    }
}