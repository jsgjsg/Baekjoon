class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len = p.length();
        
        for(int i = 0; i < t.length() - len + 1; i++) {
            String subT = t.substring(i, i + len);
            
            int j;
            for(j = 0; j < subT.length(); j++) {
                if(subT.charAt(j) < p.charAt(j)) {
                    answer++;
                    break;
                }
                else if(subT.charAt(j) == p.charAt(j)) {
                    if(j == subT.length() - 1) answer++;
                    continue;
                }
                else break;
            }
        }
        return answer;
    }
}