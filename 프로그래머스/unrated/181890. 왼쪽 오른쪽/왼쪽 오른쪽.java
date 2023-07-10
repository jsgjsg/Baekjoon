class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        
        int s = 0;
        boolean l = false, r = false;
        for(int i = 0; i < str_list.length; i++) {
            if(str_list[i].equals("l") || str_list[i].equals("r")) {
                if(str_list[i].equals("l")) l = true;
                else r = true;
                s = i;
                break;
            }
        }
        
        if(l) {
            answer = new String[s];
            for(int i = 0; i < s; i++) {
                answer[i] = str_list[i];
            }
        }
        
        else if(r) {
            int len = str_list.length - s - 1;
            answer = new String[len];
            for(int i = s + 1; i < str_list.length; i++) {
                answer[i - s - 1] = str_list[i];
            }
        }
        
        return answer;
    }
}