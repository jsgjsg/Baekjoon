class Solution {
    public int solution(int n, int[] tops) {
        int[] count = new int[n * 2 + 1];
        count[0] = 1;
        count[1] = tops[0] == 1 ? 3 : 2;
        
        // a[n] = a[n-2] + a[n-1]
        for(int i = 2; i <= n * 2; i++) {
            count[i] += count[i - 2];
            if(i % 2 == 0) count[i] += count[i - 1];
            else count[i] += count[i - 1] * (tops[i / 2] + 1);
            count[i] %= 10007;
        }
        
        return count[n * 2];
    }
}