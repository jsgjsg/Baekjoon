class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        int num = 1;
        for(int i = 0; i < n; i++) {
            answer[0][i] = num++;
        }
        int[] now = {0, n - 1};
        
        int repeat = n - 1;
        int repeatCount = 0;
        int direction = 1; // 우 하 좌 상 순
        int[][] go = { {0, 1}, {1, 0}, {0, -1}, {-1, 0} }; // 행 번호, 열 번호
        while(num <= n * n) {            
            for(int i = 0; i < repeat; i++) {
                now[0] += go[direction][0];
                now[1] += go[direction][1];
                answer[now[0]][now[1]] = num++;
            }
            
            direction = (direction + 1) % 4;
            repeatCount++;
            if(repeatCount == 2) {
                repeat--;
                repeatCount = 0;
            }
        }
        
        return answer;
    }
}