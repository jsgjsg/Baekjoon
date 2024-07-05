class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        double m1 = slope(dots[0], dots[1]);
        double m2 = slope(dots[0], dots[2]);        
        double m3 = slope(dots[0], dots[3]);
        double m4 = slope(dots[1], dots[2]);        
        double m5 = slope(dots[1], dots[3]);
        double m6 = slope(dots[2], dots[3]);
        
        if (parallel(m1, m6)) return 1;
        if (parallel(m2, m5)) return 1;
        if (parallel(m3, m4)) return 1;
        
        return 0;
    }
    public double slope(int[] dot1, int[] dot2) {
        return (double)(dot1[0] - dot2[0]) / (dot1[1] - dot2[1]);
    }
    public boolean parallel(double m1, double m2) {
        return m1 == m2;
    }
}