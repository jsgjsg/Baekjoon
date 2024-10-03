import java.util.*;

class Solution {
    public int[] solution(int[][] edges) {
        int[] answer = new int[4];

        int[] in = new int [1_000_001];
        int[] out = new int [1_000_001];
        
        for(int i = 0; i < edges.length; i++) {
            out[edges[i][0]]++;
            in[edges[i][1]]++;
        }
        // 생성한 정점(0), 도넛(1), 막대(2), 8자(3)
        for(int i = 1; i <= 1_000_000; i++) {
            if(out[i] > 2) answer[0] = i;
            else if(out[i] == 0) {
                if(in[i] != 0) answer[2]++;
            }
            else if(out[i] == 1) continue;
            else {
                if(in[i] == 0) answer[0] = i;
                else answer[3]++;
            }
        }
        answer[1] = out[answer[0]] - answer[2] - answer[3];
        
        return answer;
    }
}