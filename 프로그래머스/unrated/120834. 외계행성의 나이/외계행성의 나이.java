class Solution {
    public String solution(int age) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        while(age != 0) {
            sb.append((char)(age % 10 + 'a'));
            age /= 10;
        }
        answer = sb.reverse().toString();
        
        return answer;
    }
}