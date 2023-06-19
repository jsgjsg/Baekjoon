import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] stk;
        
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < arr.length; i++) {
            if(list.size() == 0) list.add(arr[i]);
            else {
                while(list.size() > 0 && list.get(list.size() - 1) >= arr[i]) {
                    list.remove(list.size() - 1);
                }
                list.add(arr[i]);               
            }
        }
        
        int len = list.size();
        stk = new int[len];
        for(int i = 0; i < len; i++) {
            stk[i] = list.get(i);
        }
        
        return stk;
    }
}