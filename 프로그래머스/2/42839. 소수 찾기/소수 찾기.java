import java.util.*;
class Solution {
    boolean[] isPrime;
    boolean[] visited;
    public int solution(String numbers) {
        int answer = 0;
        
        int len = numbers.length();
        prime(len);
        
        visited = new boolean[len];
        HashSet<Integer> set = new HashSet<>();
        
        for(int l = 1; l <= len; l++) {
            makeNum(numbers, "0", set, 0, l);
        }
        
        for(int num : set) {
            if(isPrime[num]) answer++;
        }
        
        return answer;
    }
    public void makeNum(String numbers, String made, HashSet<Integer> set, int count, int len) {
        if(count >= len) {
            set.add(Integer.parseInt(made));
            return;
        }
        
        for(int i = 0; i < numbers.length(); i++) {
            if(!visited[i]) {
                visited[i] = true;
                String add = made;
                add += numbers.charAt(i);
                makeNum(numbers, add, set, count + 1, len);
                
                visited[i] = false;
            }
        }
    }
    
    public void prime(int n) {
        int range = (int)Math.pow(10, n);
        isPrime = new boolean[range];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i = 2; i <= Math.sqrt(range); i++) {
            if(isPrime[i]) {
                for(int j = i * 2; j < range; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }
}