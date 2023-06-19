class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        
        for(int i = 0; i < queries.length; i++) {
            StringBuilder sb = new StringBuilder();
            
            int start = queries[i][0];
            int end = queries[i][1];
            
            for(int j = 0; j < my_string.length(); j++) {
                int index;
                if(j >= start && j <= end) index = start + end - j;
                else index = j;
                sb.append(my_string.charAt(index));
            }
            
            my_string = sb.toString();
        }
        answer = my_string;
        return answer;
    }
}