class Solution {
    public int[] solution(int m, int n, int startX, int startY, int[][] balls) {
        int cnt = balls.length;
        int[] answer = new int[cnt];

        for(int i = 0; i < cnt; i++) {
            int min = Integer.MAX_VALUE;

            int dX = balls[i][0];
            int dY = balls[i][1];

            if(startY != dY) {
                min = Math.min((int)Math.pow(dX + startX, 2) + (int)Math.pow(dY - startY, 2), min);
                min = Math.min((int)Math.pow(dX + startX - m * 2, 2) + (int)Math.pow(dY - startY, 2), min);
            } else {
                if(startX > dX) min = Math.min((int)Math.pow(m * 2 - startX - dX, 2), min);
                else min = Math.min((int)Math.pow(startX + dX, 2), min);
            }
            
            if(startX != dX) {
                min = Math.min((int)Math.pow(dX - startX, 2) + (int)Math.pow(dY + startY, 2), min);
                min = Math.min((int)Math.pow(dX - startX, 2) + (int)Math.pow(dY + startY - n * 2, 2), min);
            } else {
                if(startY > dY) min = Math.min((int)Math.pow(n * 2 - startY - dY, 2), min);
                else min = Math.min((int)Math.pow(startY + dY, 2), min);
            }

            answer[i] = min;
        }
        return answer;
    }
}