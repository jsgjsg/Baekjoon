import java.util.*;
class Solution {
    public int solution(int n, int[][] edge) {
        int answer = 0;
        int[] distance = new int[n + 1];
        
        ArrayList<Integer>[] startNode = new ArrayList[n + 1];
        for(int i = 1; i <= n; i++) startNode[i] = new ArrayList<>();
        for(int i = 0; i < edge.length; i++) {
            startNode[edge[i][0]].add(edge[i][1]);
            startNode[edge[i][1]].add(edge[i][0]);
        }
        
        Queue<Integer> queue = new LinkedList<> ();
        queue.offer(1);
        while(!queue.isEmpty()) {
            int start = queue.poll();
            
            for(int end : startNode[start]) {
                if(distance[end] == 0) {
                    distance[end] = distance[start] + 1;
                    queue.offer(end);
                }
                
                startNode[end].remove(Integer.valueOf(start));
            }
        }
        
        Arrays.sort(distance);
        int max = distance[n];
        
        for(int i = n; i >= 0; i--) {
            if(max > distance[i]) break;
            answer++;
        }
        
        return answer;
    }
}