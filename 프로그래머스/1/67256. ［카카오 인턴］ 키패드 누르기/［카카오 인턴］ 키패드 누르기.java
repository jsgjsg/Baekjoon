import java.util.*;
class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        
        int L = 10, R = 12;
        boolean isLmid = false;
        boolean isRmid = false;
        
        for(int num : numbers) {
            if(num == 0) num = 11;
            switch(num) {
                case 1: case 4: case 7:
                    answer.append("L");
                    L = num;
                    isLmid = false;
                    break;
                case 3: case 6: case 9:
                    answer.append("R");
                    isRmid = false;
                    R = num;
                    break;
                case 2: case 5: case 8: case 11:
                    int disFromL = isLmid ? Math.abs((L - num) / 3) : Math.abs((L + 1 - num) / 3) + 1;
                    int disFromR = isRmid ? Math.abs((R - num) / 3) : Math.abs((R - 1 - num) / 3) + 1;
                    if(disFromL < disFromR) {
                        answer.append("L");
                        L = num;
                        isLmid = true;
                    }
                    else if(disFromL > disFromR) {
                        answer.append("R");
                        R = num;
                        isRmid = true;
                    }
                    else {
                        if(hand.equals("left")) {
                            answer.append("L");
                            L = num;
                            isLmid = true;
                        }
                        else {
                            answer.append("R");
                            R = num;
                            isRmid = true;
                        }
                    }
            }
        }
        return answer.toString();
    }
}