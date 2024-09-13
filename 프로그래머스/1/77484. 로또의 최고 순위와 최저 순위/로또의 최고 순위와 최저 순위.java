class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int countZero = 0;
        int countMatch = 0;
        
        for(int i = 0; i < 6; i++) {
            if(lottos[i] == 0) countZero++;
            else for(int j = 0; j < 6; j++) {
                if(lottos[i] == win_nums[j]) {
                    countMatch++;
                    break;
                }
            }
        }
        int max = countMatch + countZero == 0 ? 6 : 7 - (countMatch + countZero);
        int min = countMatch == 0 ? 6 : 7 - countMatch;

        return new int[] {max, min};
    }
}