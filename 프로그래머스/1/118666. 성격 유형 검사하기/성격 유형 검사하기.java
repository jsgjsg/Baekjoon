class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int RT = 0, CF = 0, JM = 0, AN = 0;
        
        for(int i = 0; i < survey.length; i++) {
            
            switch(survey[i]) {
                case "RT": 
                    RT += choices[i] - 4;
                    break;
                case "TR": 
                    RT -= choices[i] - 4;
                    break;
                    
                case "CF": 
                    CF += choices[i] - 4;
                    break;
                case "FC": 
                    CF -= choices[i] - 4;
                    break;
                    
                case "JM": 
                    JM += choices[i] - 4;
                    break;
                case "MJ": 
                    JM -= choices[i] - 4;
                    break;
                    
                case "AN": 
                    AN += choices[i] - 4;
                    break;
                case "NA": 
                    AN -= choices[i] - 4;
                    break;
            }
        }
        answer += RT > 0 ? "T" : "R";
        answer += CF > 0 ? "F" : "C";
        answer += JM > 0 ? "M" : "J";
        answer += AN > 0 ? "N" : "A";
        
        return answer;
    }
}