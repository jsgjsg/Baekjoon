import java.util.*;
class Solution {
    public int[] solution(int[] fees, String[] records) {
        int[] answer = {};
        
        int[] in = new int[10000]; // 입차 시간 기록
        Arrays.fill(in, -1);
        int[] total = new int[10000]; // 누적 시간 기록
        
        StringTokenizer st;
        for(String s: records) {
            st = new StringTokenizer(s);
            String time = st.nextToken(); // HH:MM
            int num = Integer.parseInt(st.nextToken());
            boolean isIn = st.nextToken().equals("IN") ? true : false;
            
            st = new StringTokenizer(time, ":");
            int realTime = Integer.parseInt(st.nextToken()) * 60
                + Integer.parseInt(st.nextToken());
            
            if(isIn) in[num] = realTime; // 입차
            else { // 출차
                total[num] += realTime - in[num];
                in[num] = -1;
            }
        }
        
        for(int i = 0; i < 10000; i++) {
            if(in[i] >= 0) {
                total[i] += 23 * 60 + 59 - in[i];
            }
        }
        
        List<Integer> answerList = new ArrayList<Integer>();
        for(int i = 0; i < 10000; i++) {
            if(total[i] > 0) {
                // fees[0] : 기본 시간(분), fees[1] : 기본 요금(원)
                // fees[2] : 단위 시간(분), fees[3] : 단위 요금(원)
                int cost = fees[1];
                if(total[i] > fees[0]) {
                    cost += Math.ceil((total[i] - fees[0]) * 1.0 / fees[2]) * fees[3];
                }
                answerList.add(cost);
            }
        }
        answer = answerList.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}